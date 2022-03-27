package ds.examples.appsystem;

import ds.examples.appsystem.HeatReply;
import ds.examples.appsystem.HeatRequest;
import ds.examples.appsystem.AppSystemGreetingsGrpc;
import ds.examples.appsystem.AppSystemGreetingsGrpc.AppSystemGreetingsBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class AppClient {
	public static void main(String[] args) {
		int port =50051;
		int port2=50052;
		String host="localhost";
		
		
		 //the channel of coenection
		 ManagedChannel channel= ManagedChannelBuilder
				 .forAddress(host, port2)
				 .usePlaintext().build();
		 //sent message
		 HeatRequest request = HeatRequest.newBuilder().setTemp(32).build();
		 
		 //send message via the stub method
		 AppSystemGreetingsBlockingStub stub= AppSystemGreetingsGrpc.newBlockingStub(channel);
		 
		 HeatReply reply = stub.app(request);
		 
		 System.out.println(reply.getMessage());
		}
}
