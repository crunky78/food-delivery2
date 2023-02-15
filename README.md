# food-delivery2
##■  Microservice Implementation 
1. Saga (Pub / Sub) 
![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/36ab2b48-7959-48e9-88b0-55c318e4e11d/Untitled.png)
- app 실행, mvn spring-boot:run
![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1adb2cec-3c4b-4c7e-a822-533b5410f7db/Untitled.png)
- app 
2. CQRS 
3. Compensation / Correlation 
##■  Microservice Orchestration 
![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/79f9c384-dc0c-4900-93b8-b5bd2142eb55/Untitled.png)
- 도커허브를 통한 도커 이미지 빌드
*![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1287b82e-b888-4f84-bf86-ecfc74e1611d/Untitled.png)
오류 발생
![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/026bc47e-f428-4200-ae23-e1f0d59d623c/Untitled.png)
- mvn clean package -Dmaven.test.skip=true 실행
![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/672b16d6-2bc2-4fdd-993e-a9a8ef74820b/Untitled.png)
오류 해결

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/149fde77-039a-43b8-bf9b-707e1aed4566/Untitled.png)
order에 있는 도커 이미지
![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/66103f91-9756-4e4a-bd19-4716835aa4dd/Untitled.png)
- 도커 푸시
![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f41c2981-f7e3-4bc1-9cf5-6c471bfaa30d/Untitled.png)
- 세개 모두 도커 허브에 성공적으로 올라감
![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b6c69234-c1e9-4b3b-9216-50a28c828b1f/Untitled.png)
- 카프카 실행
1. Deploy to EKS Cluster 
2. Gateway & Service Router 설치 
3. Autoscale (HPA)
