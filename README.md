# food-delivery2

## 1.Saga (Pub / Sub) 
![image](https://user-images.githubusercontent.com/73973086/219940304-305cb56c-cd10-4a92-8164-6d17215f2ff5.png)
![image](https://user-images.githubusercontent.com/73973086/219941946-92e6d60c-b63b-45f9-8686-39631e76f852.png)


## 2.CQRS
![image](https://user-images.githubusercontent.com/73973086/219940522-94f2f872-4540-4104-bb0a-a125eb74d9c3.png)

## 3. Compensation / Correlation
![image](https://user-images.githubusercontent.com/73973086/219941366-ced06923-3fea-4f30-8c2e-905f9a618c0c.png)
**오더 주문 취소 로직


![image](https://user-images.githubusercontent.com/73973086/219616475-85806fe0-5ba0-41b1-9c85-2583f1a2473a.png)
- 실행, mvn spring-boot:run
![image](https://user-images.githubusercontent.com/73973086/219922906-fca7ce73-9645-4fa9-900b-dde21f6db6ad.png)
order를 통해 주문완료


## 1. Deploy to EKS Cluster 
**도커 배포**
![도커 배포](https://user-images.githubusercontent.com/73973086/219024426-7145969c-ddcf-4f60-98c4-6b946473e241.png)

![오류](https://user-images.githubusercontent.com/73973086/219024496-c43266ea-3a5e-43eb-9bba-84d4f6c3bf65.png)

-오류남 -> 메이븐 클린을 해줘야함

![mvn clean 실행](https://user-images.githubusercontent.com/73973086/219024576-202f522b-f645-4ce1-ad7e-496e0d3deeab.png)
- mvn clean 실행

![성공](https://user-images.githubusercontent.com/73973086/219024618-83f859f3-5bd0-4167-b009-eacf9501a78d.png)
도커 성공

![order에 있는 도커 이미지](https://user-images.githubusercontent.com/73973086/219024683-f6f25dcf-8bb7-4a29-96f1-af31fb775964.png)

 order에 있는 도커 이미지

![도커 푸시](https://user-images.githubusercontent.com/73973086/219024716-b8ae7877-4e25-4b9b-909a-b2044eecc6fc.png)

도커 푸시

![Untitled](https://user-images.githubusercontent.com/73973086/219024743-556eff73-3afc-4352-88bc-ffb535340f7c.png)

![Untitled](https://user-images.githubusercontent.com/73973086/219024867-9d5fcbad-c3c8-456d-869e-a15939ea41eb.png)
**나머지 도커 이미지들(gateway 포함) 모두 docker hub에 넣어줌

![Untitled](https://user-images.githubusercontent.com/73973086/219024900-ef9b1a53-9a41-4752-a6f4-9ef7da6c93f9.png)

## 2. Gateway & Service Router 설치 

![image](https://user-images.githubusercontent.com/73973086/219026189-d71e5b90-345b-42de-a6cf-8ab4f235934a.png)
클러스터 생성

![image](https://user-images.githubusercontent.com/73973086/219028858-57aa6a39-a7a2-4c8a-b584-a7ca77a1f619.png)
클러스터 생성 완료
![image](https://user-images.githubusercontent.com/73973086/219044787-6cfccd57-6aa3-4250-b8e8-60b9755b697a.png)

**클러스터에 배포
- yaml 파일로 배포
- ![image](https://user-images.githubusercontent.com/73973086/219045573-9adc15a6-9f7f-4474-8b82-475c5070736e.png)
service 설치 & 배포
![image](https://user-images.githubusercontent.com/73973086/219047006-239d83c3-69d0-405d-bc44-f2d717a1a039.png)

order, product, delivery, gateway 모두 yaml을 통해 클러스터에 배포 완료


![image](https://user-images.githubusercontent.com/73973086/219029480-dff926b7-3a1b-4fc4-9856-13ad2a91af7f.png)
도커 허브를 이용해 order 마이크로 서비스 실행

![image](https://user-images.githubusercontent.com/73973086/219029641-bfa6016c-e783-4bd3-8dd9-8faceaecbacf.png)
-- 성공적으로 po 확인

--log 확인


![image](https://user-images.githubusercontent.com/73973086/219030484-53762546-e2ea-4518-886f-9b5bee8c0cc3.png)


--Helm 설치
![image](https://user-images.githubusercontent.com/73973086/219030610-c0ad032e-7d83-490c-9139-daef5aade946.png)
kafka(namespace 없이)

![image](https://user-images.githubusercontent.com/73973086/219040900-c9b9f077-4a71-4df0-b932-67d066e946f7.png)
kubectl get all

## 3. Autoscale (HPA)

![image](https://user-images.githubusercontent.com/73973086/219052324-d4aefd50-efd0-4533-bcb8-b5ff1f49d5d0.png)
order autoscale 실행
![image](https://user-images.githubusercontent.com/73973086/219052692-c2dc4965-46c8-4e86-b3c0-34eb087f72db.png)





