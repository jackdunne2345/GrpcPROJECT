package ds.examples.heatsystem;

import ds.examples.heatsystem.HeatSystemGreetingsGrpc.HeatSystemGreetingsBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class HeatClient {
	public static void main(String[] args) {
		int port =50051;
		String host="localhost";
		
		 //the channel of coenction
		 ManagedChannel channel= ManagedChannelBuilder
				 .forAddress(host, port)
				 .usePlaintext().build();
		 //sent message
		 HeatRequest request = HeatRequest.newBuilder().setTemp(32).build();
		 
		 //send message via the stub method
		 HeatSystemGreetingsBlockingStub stub= HeatSystemGreetingsGrpc.newBlockingStub(channel);
		 
		 HeatReply reply = stub.sayHello(request);
		 
		 System.out.println(reply.getMessage());
		}
	}

