# CollectionFramework

---

**컬렉션 프레임워크**(Collecion Framework)란 대량의 데이터를 효율적으로 처리할 수 있는 클래스의 집합을 의미한다.

주로 LIST, SET, MAP 인터페이스들이 사용된다.

**List와 Set, Queue는 모두 Collection 인터페이스를 상송받지만 Map 인터페이스는 독립적으로 정의되어있다.**



## List![Untitled](https://user-images.githubusercontent.com/52336493/171611712-c7dad809-a636-4694-a75f-5aa96975fc74.png)

순서 개념이 있는 데이터의 집합(인덱스 관리)

List 인터페이스는 순서가 있는 컬렉션이며 중복 요소를 포함 할 수 있다.

![Untitled 1](https://user-images.githubusercontent.com/52336493/171611863-f81901de-6c06-48dd-b3a6-d73a24c7d8cc.png)


(List 에 선언된 기본 메소드들)

List로 구현된 클래스는 ArrayList, LinkedList등이 있다.

- Arraylist
    
    arraylist는 저장 용량을 초과한 객체들이 들어오면 자동적으로 저장 용량이 늘어나는 특징이 있다.
    
    ![Untitled 2](https://user-images.githubusercontent.com/52336493/171611919-0cf1b1e3-7108-4838-9089-ef56602eae01.png)

    
    arraylist 메소드들
    
- Linkedelist
    
    각 데이터가 노드와 포인터로 구성이 되어서 서로 연결이 되어있다.
    
    linkedlist에서 특정 인덱스의 객체를 제거하면 앞뒤 링크만 변경되고 나머지 링크는 변경되지 않는다. 따라서 삭제와 삽입이 빈번히 일어난곳에 유리하다.
    
    ![Untitled 3](https://user-images.githubusercontent.com/52336493/171611951-8cc3f996-78c0-4297-b743-ef415da6aae1.png)

    
    linkedlist 메소드들
    
- Vector
    
    vector는 arraylist와 동일하지만 thred-safe하다는 것에서 차이가 새긴다.
