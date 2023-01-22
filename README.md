# SpringSecurity

## Spring Security 사용방법

### Spring Security를 사용하여 로그인 및 회원가입 구현

#### Spring Security에 DB를 연결하여 회원가입한 유저를 조회해 로그인이 가능하게 만들었고, 추가적으로 로그인 유지하기까지 만들어 한번 로그인하면 한달간 로그인 상태가 유지되게 만들었습니다.
#### 그리고 로그아웃은 세션이 제대로 제거되지 않는 문제를 HttpSessionEventPublisher를 리스너로 등록하여 해결하였습니다.

##### 사용된 데이터베이스 : MySQL - soju2
	CREATE DATABASE soju2;
	USE soju2;

##### 사용된 테이블 : Member
	CREATE TABLE Member (
		emailId VARCHAR(50) PRIMARY KEY, #이메일 형식 아이디
		pwd VARCHAR(255) NOT NULL, #비밀번호
		name VARCHAR(10) NOT NULL, #이름
		nickname VARCHAR(20) UNIQUE NOT NULL, #닉네임
		birthday DATE NOT NULL, #생년월일
		gender VARCHAR(1) NOT NULL, #성별
		phoneNumber VARCHAR(15) UNIQUE NOT NULL, #핸드폰 번호
		address VARCHAR(100) NOT NULL, #주소
		studyType VARCHAR(10) NOT NULL, #관심있는 분야
		platform VARCHAR(10) NOT NULL, #플랫폼
		roleName VARCHAR(100) NOT NULL #Spring Security 권한
	);
