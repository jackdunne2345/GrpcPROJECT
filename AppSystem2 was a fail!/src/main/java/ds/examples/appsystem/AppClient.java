package ds.examples.appsystem;

import ds.examples.appsystem.HeatReply;

import ds.examples.appsystem.HeatRequest;
import ds.examples.appsystem.AppSystemGreetingsGrpc;
import ds.examples.appsystem.AppSystemGreetingsGrpc.AppSystemGreetingsBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class AppClient {
	public static void main(String[] args) {
		int port =50053;
		int port2=50051;
		String host="localhost";
		
		//this was gonna stream a timer to the heater for when to change the heat i started with the uninary program 
		//i planned to make it a stream
		 //the channel of coenection
		 ManagedChannel channel= ManagedChannelBuilder
				 .forAddress(host, port)
				 .usePlaintext().build();
		 //sent message
		 HeatRequest request = HeatRequest.newBuilder().setTemp(32).build();
		 
		 //send message via the stub method
		 AppSystemGreetingsBlockingStub stub= AppSystemGreetingsGrpc.newBlockingStub(channel);
		 
		HeatReply reply = stub.appSystem(request);
		 
		System.out.println(reply.getMessage());
		}
}
