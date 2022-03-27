package ds.examples.heatsystem;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import java.io.IOException;

import ds.examples.heatsystem.HeatSystemGreetingsGrpc.HeatSystemGreetingsImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
public class HeatServer extends HeatSystemGreetingsImplBase {
	public static void main(String[] args) {
		HeatServer hService= new HeatServer();
		int port= 50051;
		try {
			Server server=ServerBuilder.forPort(port)
					.addService(hService)
					.build()
					.start();
			System.out.println("server waiting for a request");
			//this blocks and waiting for client request
			server.awaitTermination();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}
	//implementing the server method
	public void sayHello(HeatRequest request, StreamObserver<HeatReply> responseObserver) {
	   int temp=request.getTemp();
	   int number=request.getNumber();
	   System.out.println("heat set to "+temp+"°C");
	   
	  String reply_text="heat is set to"+Integer.toString(temp);
	   HeatReply reply = HeatReply.newBuilder().setMessage(reply_text).build();

	   responseObserver.onNext(reply);
	} 
}

