This demo shows a wired things with Helidon-SE, which would not be reproduced with pure graalvm.

## What's the problem

Let say a Class is invoking `InetAddress.getLocalHost()` method in static scope.

When we run the app inside a docker container, the static field will hold a strange string other than "localhost" or any other hostname we usually see.

## How to reproducd

Try run the following commands, and compare the output.

```
docker-compose up demo-helidon
docker-command up demo-graal
```