package example.crudschedule.schedule.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor // 매개변수 없는 기본 생성자를 자동으로 만들어 줌
public class Schedule extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 1000)
    private String content;

    // 아이디는 자동 생성이기 때문에 추가하지 않음
    // 생성용
    public Schedule(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // 수정용
    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
