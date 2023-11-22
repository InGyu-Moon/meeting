package group.meetmix.service.meeting;

import group.meetmix.data.dto.MeetingDto;

import java.util.List;

public interface MeetingService {
    public void saveMeeting(MeetingDto meetingDto);
    public List<MeetingDto> findAllMeetings();
}
