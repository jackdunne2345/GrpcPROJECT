package ds.examples.heatsystem;



import ds.examples.heatsystem.HeatSystemGreetingsGrpc.HeatSystemGreetingsBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import javax.swing.JFrame;
import ds.examples.heatsystem.NewJFrame;

public class HeatClient  {
	public static void main(String[] args) {
                NewJFrame j =new NewJFrame();
                j.setVisible(true);
		
	}
        public static String run(int temp){
                int port =50051;
		int port2=50052;
                
		String host="localhost";
		 //the channel of connection
		 ManagedChannel channel= ManagedChannelBuilder
				 .forAddress(host, port)
				 .usePlaintext().build();
		 //sent message
		 HeatRequest request = HeatRequest.newBuilder().setTemp(temp).build();
		 
		 //send message via the stub method
		 HeatSystemGreetingsBlockingStub stub= HeatSystemGreetingsGrpc.newBlockingStub(channel);
		 
		 HeatReply reply = stub.heat(request);
		 
		 String replyS= reply.getMessage();
                 return replyS;
		}
}
