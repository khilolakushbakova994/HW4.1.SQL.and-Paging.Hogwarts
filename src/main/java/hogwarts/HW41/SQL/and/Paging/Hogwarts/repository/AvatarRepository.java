package hogwarts.HW41.SQL.and.Paging.Hogwarts.repository;


import hogwarts.HW41.SQL.and.Paging.Hogwarts.model.Avatar;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AvatarRepository extends JpaRepository<Avatar, Long> {
     Avatar findAvatarById (Long studentId);
}