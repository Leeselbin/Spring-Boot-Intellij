# Spring-Boot-Intellij
#### 코드출처  유투브 홍팍 스프링부트 강의 https://www.youtube.com/c/%ED%99%8D%ED%8C%8D

### DB : mariaDB 2.7.3
### IDE : Intellij 
### TOOLS : SPRING BOOT(framework), BOOTSTRAP(framework) , GRADLE(build tool) , JPA , MUSTACHE(view)






@Builder 패턴이란?
-복합 객체의 생성 과정과 표현 방법을 분리하여 동일한 생성 절차에서 서로 다른 표현 결과를 만들 수
있게 하는 패턴이다.(출처: 위키백과)

-생성자에 인자가 많을 때는 빌더 패턴을 고려한다.
1. 객체들마다 들어가야할 인자가 각각 다를 때 유연하게 사용할 수 있다.

2. 무조건 setter 생성을 방지하고 불변객체로 만들 수 있다.

3. 필수 argument를 지정할 수 있다.(보통의 경우, PK 역할을 할 Id 값이 될 것이다.)
 
