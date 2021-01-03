### 참고 사이트
* https://coding-start.tistory.com/352?category=842331
* https://jeong-pro.tistory.com/192

### gRPC Java Codegen
* https://github.com/grpc/grpc-java/blob/master/compiler/README.md
* protoc-gen-grpc-java 플러그인을 이용하여 main/java 로 생성할 수 있음
```
cd compiler
../gradlew java_pluginExecutable -PskipAndroid=true

cd build/exe/java_plugin
```