import grpc
import windowsystem_pb2
import windowsystem_pb2_grpc
from concurrent import futures
#print('we dont have lift off')
class WindowOcServiceServicer(windowsystem_pb2_grpc.WindowOcServiceServicer):
    def windowsOC(self, request, context):
        toggle=windowsystem_pb2.WindowRequest.val
        return windowsystem_pb2.WindowResult(toggle=toggle)

def main():
    server =grpc.server(futures.ThreadPoolExecutor(max_workers=1))
    windowsystem_pb2_grpc.add_WindowOcServiceServicer_to_server(WindowOcServiceServicer(),server)
   #this is adding the server to the port come back here later
    print('we have lift off!!')
    server.add_insecure_port('[::]:50052')
    server.start()
    server.wait_for_termination()

main()