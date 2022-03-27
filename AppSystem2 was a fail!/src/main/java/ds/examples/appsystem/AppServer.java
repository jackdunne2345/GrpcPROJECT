package ds.examples.appsystem;

import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

import java.io.IOException;

import ds.examples.appsystem.AppSystemGreetingsGrpc.AppSystemGreetingsImplBase;
import ds.examples.appsystem.HeatSystemGreetingsGrpc.HeatSystemGreetingsImplBase;
import ds.examples.appsystem.HeatReply;
import ds.examples.appsystem.HeatRequest;
import ds.examples.appsystem.AppServer;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
public class AppServer extends AppSystemGreetingsImplBase{
	public static void main(String[] args) {
		AppServer AService= new AppServer();
		int port= 50053;
		int port2=50051;
		try {
			Server server=ServerBuilder.forPort(port)
					.addService(AService)
					.build()
					.start();
			System.out.println("we have lift off!!");
			//blocks and waits for client request
			server.awaitTermination();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}
	//server method
	public void app(HeatRequest request, StreamObserver<HeatReply> responseObserver) {
	   int temp=request.getTemp();
	   System.out.println("heat set to "+temp+"°C");
	   
	  String reply_text="heat is set to"+Integer.toString(temp);
	   HeatReply reply = HeatReply.newBuilder().setMessage(reply_text).build();

	   responseObserver.onNext(reply);
	} 
}
