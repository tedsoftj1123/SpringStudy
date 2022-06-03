# CollectionFramework

---

**컬렉션 프레임워크**(Collecion Framework)란 대량의 데이터를 효율적으로 처리할 수 있는 클래스의 집합을 의미한다.

주로 LIST, SET, MAP 인터페이스들이 사용된다.

**List와 Set, Queue는 모두 Collection 인터페이스를 상송받지만 Map 인터페이스는 독립적으로 정의되어있다.**

![Untitled](CollectionFramework%208041453b430b45ae95bb9c621a6979d6/Untitled.png)

## List

순서 개념이 있는 데이터의 집합(인덱스 관리)

List 인터페이스는 순서가 있는 컬렉션이며 중복 요소를 포함 할 수 있다.

![Untitled](CollectionFramework%208041453b430b45ae95bb9c621a6979d6/Untitled%201.png)

(List 에 선언된 기본 메소드들)

List로 구현된 클래스는 ArrayList, LinkedList, Vector등이 있다.

- Arraylist
    
    arraylist는 저장 용량을 초과한 객체들이 들어오면 자동적으로 저장 용량이 늘어나는 특징이 있다. 또한 특정 인덱스의 객체를 제거하면 바로 뒤 인덱스부터 마지막 인덱스까지 모두 앞으로 1씩 당겨진다.
    
    ![Untitled](CollectionFramework%208041453b430b45ae95bb9c621a6979d6/Untitled%202.png)
    
    arraylist 메소드들
    
- Linkedelist
    
    각 데이터가 노드와 포인터로 구성이 되어서 서로 연결이 되어있다.
    
    linkedlist에서 특정 인덱스의 객체를 제거하면 앞뒤 링크만 변경되고 나머지 링크는 변경되지 않는다. 따라서 삭제와 삽입이 빈번히 일어난곳에 유리하다.
    
    ![Untitled](CollectionFramework%208041453b430b45ae95bb9c621a6979d6/Untitled%203.png)
    
    linkedlist 메소드들
    
- Vector
    
    vector는 arraylist와 동일하지만 thred-safe하다는 것에서 차이가 새긴다.
    

## Set

순서 개념이 없는 데이터의 집합이다. List와 달리 데이터의 중복이 허용되지 않고 데이터 탐색을 하기 위해선 itrerator를 생성하여 데이터를 가져와야한다.

![Untitled](CollectionFramework%208041453b430b45ae95bb9c621a6979d6/Untitled%204.png)

(Set에 선언되 기본 메소드들)

Set으로 구현된 클래스는 HashSet, TreeSet, LinkedHashSet등이 있다.

- HashSet
    
    동일한 객체의 중복저장이 불가능하고 순서 없이 저장한다. HashSet은 객체를 저장하기 전에 객체의 hashCode() 메소드를 호출해서 이미 저장되있는 개체들의 해시코드와 비교한 후 저장한다.
    
- TreeSet
    
    treeset은 hashset과 동일하게 동일한 객체의 중복저장이 물가능하고 순서없이 저장하지만 이진 탐색 트리 구조로 이루어져 있어 정렬과 검색에 유용하다.