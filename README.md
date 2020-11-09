# mruv-pb-java
Generated MruV API library files for Java

To create .jar package type: 
`mvn clean package`


## Example code
This example will connect to MruV API on address `127.0.0.1:50051` and will run remote procedure [IsAccountExist](https://github.com/MruV-RP/mruv-pb-docs/blob/master/docs.md#mruvaccountsservice)
```java
public class Main {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("127.0.0.1", 50051)
                .usePlaintext()
                .build();
        MruVAccountsServiceGrpc.MruVAccountsServiceBlockingStub mruVAccountsServiceBlockingStub = MruVAccountsServiceGrpc.newBlockingStub(channel);
        Accounts.IsAccountExistRequest request = Accounts.IsAccountExistRequest.newBuilder().setLogin("Account Login").build();
        Accounts.IsAccountExistResponse response;
        try {
            response = mruVAccountsServiceBlockingStub.isAccountExist(request);
        } catch (StatusRuntimeException e) {
            System.out.println("Error: " + e.getStatus());
            return;
        }
        System.out.println("Response: " + response.toString());
        try {
            channel.shutdownNow().awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ending");
    }
}
```
