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
![도커 배포](https://user-images.githubusercontent.com/73973086/219024426-7145969c-ddcf-4f60-98c4-6b946473e241.png)
![오류](https://user-images.githubusercontent.com/73973086/219024496-c43266ea-3a5e-43eb-9bba-84d4f6c3bf65.png)
오류남
![mvn clean 실행](https://user-images.githubusercontent.com/73973086/219024576-202f522b-f645-4ce1-ad7e-496e0d3deeab.png)
![성공](https://user-images.githubusercontent.com/73973086/219024618-83f859f3-5bd0-4167-b009-eacf9501a78d.png)
![order에 있는 도커 이미지](https://user-images.githubusercontent.com/73973086/219024683-f6f25dcf-8bb7-4a29-96f1-af31fb775964.png)
![도커 푸시](https://user-images.githubusercontent.com/73973086/219024716-b8ae7877-4e25-4b9b-909a-b2044eecc6fc.png)
![Untitled](https://user-images.githubusercontent.com/73973086/219024743-556eff73-3afc-4352-88bc-ffb535340f7c.png)
![Untitled](https://user-images.githubusercontent.com/73973086/219024867-9d5fcbad-c3c8-456d-869e-a15939ea41eb.png)
![Untitled](https://user-images.githubusercontent.com/73973086/219024900-ef9b1a53-9a41-4752-a6f4-9ef7da6c93f9.png)
![image](https://user-images.githubusercontent.com/73973086/219026189-d71e5b90-345b-42de-a6cf-8ab4f235934a.png)
클러스터 생성

![image](https://user-images.githubusercontent.com/73973086/219028858-57aa6a39-a7a2-4c8a-b584-a7ca77a1f619.png)
클러스터 생성 완료
![image](https://user-images.githubusercontent.com/73973086/219029480-dff926b7-3a1b-4fc4-9856-13ad2a91af7f.png)
도커 허브를 이용해 order 마이크로 서비스 실행

![image](https://user-images.githubusercontent.com/73973086/219029641-bfa6016c-e783-4bd3-8dd9-8faceaecbacf.png)
-- 성공적으로 po 확인

--log 확인

![image](https://user-images.githubusercontent.com/73973086/219030484-53762546-e2ea-4518-886f-9b5bee8c0cc3.png)
--Helm 설치
![image](https://user-images.githubusercontent.com/73973086/219030610-c0ad032e-7d83-490c-9139-daef5aade946.png)
kafka(namespace 없이)


1. Deploy to EKS Cluster 
2. Gateway & Service Router 설치 
3. Autoscale (HPA)
