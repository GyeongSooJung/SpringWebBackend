package mobile.backend.module.file.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.extern.slf4j.Slf4j;
import mobile.backend.module.file.File;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

import static mobile.backend.module.file.QFile.*;

@Repository
@Slf4j
public class FileQueryRepository {
    private final JPAQueryFactory query;

    public FileQueryRepository(EntityManager em) {
        this.query = new JPAQueryFactory(em);
    }

//    public List<File> findByOthers(
//            String fileWhere,
//            String fileCustomerCode,
//            String fileWorkerCode,
//            String fileKinds
//    ) {
//        return query.selectFrom(file)
//                .where(
//                        file.fileWhere.eq(fileWhere)
//                                .and(file.fileCustomerCode.eq(fileCustomerCode))
//                                .and(file.fileWorkerCode.eq(fileWorkerCode))
//                                .and(file.fileKinds.eq(fileKinds))
//                ).fetch();
//    }

}
