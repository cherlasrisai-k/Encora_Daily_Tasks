# Steps to be followed for Execution

1. Start the kafka server
   <pre>kafka-server-start.bat C:\kafka\config\server.properties</pre>
2. Create a topic
   <pre>kafka-topics.bat --create --topic InventoryTopic --bootstrap-server localhost:9092</pre>
3. Run Inventoryservice33 and Orderservice33 microservices.
4. Navigate to the end points through Postman Api.
    - Inventoryservice33 end point - /Inventory/create
    - Orderservice33 end point - /api/orders

