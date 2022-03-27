import grpc
import windowsystem_pb2
import windowsystem_pb2_grpc

def run():
             with grpc.insecure_channel('0.0.0.0:50052') as channel:
              stub=  windowsystem_pb2_grpc.WindowOcServiceStub(channel)
              #cahnge input to in the code atm ran out of time, my bad :(
              reply= stub.windowsOC(windowsystem_pb2.WindowRequest(input(1)));
              print(reply.val)

if __name__=='__main__':
    run()