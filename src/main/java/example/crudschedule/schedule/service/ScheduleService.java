package example.crudschedule.schedule.service;

import example.crudschedule.schedule.dto.ScheduleResponse;
import example.crudschedule.schedule.entity.Schedule;
import example.crudschedule.schedule.repository.ScheduleRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;

    // 일정 생성
    @Transactional
    public ScheduleResponse create(String title, String content) {

        Schedule schedule = new Schedule(title, content);
        Schedule savedSchedule = scheduleRepository.save(schedule);

        return new ScheduleResponse(
                savedSchedule.getId(),
                savedSchedule.getTitle(),
                savedSchedule.getContent(),
                savedSchedule.getCreatedAt(),
                savedSchedule.getCreatedAt()
        );
    }
}
