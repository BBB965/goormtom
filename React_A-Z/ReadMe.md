1. 이 폴더 실습들은 인프런 강의 '따라하며 배우는 리액트 A-Z' 내용입니다.

2. 리액트의 주요 특징
    - 프레임워크가 아닌 라이브러리
    - 가상돔 : 변화된 것을 매번이 아닌 한꺼번에 적용
        웹 페이지 빌드 과정 (Critical Rendering Path. CRP) : 웹 브라우저가 HTML 문서를 읽고, 스타일 입히고 뷰포트에 표시하는 과정. DOM에 변화가 발생하면 Render Tree가 재생성된다. (인터렉션이 많다면, DOM을 많이 조작하기 때문에 비용이 너무 크게 된다.) -> 그래서 가상돔 이용
    
    +) Webpack : 오픈 소스 자바스크립트 모듈 번들러. 여러 파일들을 번들로 압축하여 최적화 가능 (비용 줄일 수 있다) & 모듈 단위 개발 가능
    +) 바벨 : 최신 자바스크립트 문법을 구형 브라우저에서도 구동할 수 있게 변환시켜주는 라이브러리