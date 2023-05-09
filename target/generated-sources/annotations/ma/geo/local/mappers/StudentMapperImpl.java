package ma.geo.local.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import ma.geo.local.entities.Adresse;
import ma.geo.local.entities.CourseEntity;
import ma.geo.local.entities.NiveauEntity;
import ma.geo.local.entities.StudentEntity;
import ma.geo.local.entities.StudentId;
import ma.geo.local.models.AdresseDTO;
import ma.geo.local.models.CourseDTO;
import ma.geo.local.models.NiveauDTO;
import ma.geo.local.models.StudentDTO;
import ma.geo.local.models.StudentIdDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-09T15:56:46+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.2 (Oracle Corporation)"
)
public class StudentMapperImpl implements StudentMapper {

    @Override
    public StudentEntity studentDtoToEntity(StudentDTO dto) {
        if ( dto == null ) {
            return null;
        }

        StudentEntity studentEntity = new StudentEntity();

        studentEntity.setCourses( courseDTOListToCourseEntityList( dto.getCourses() ) );
        studentEntity.setNiveau( niveauDTOToNiveauEntity( dto.getNiveau() ) );
        studentEntity.setAdresse( adresseDTOToAdresse( dto.getAdresse() ) );
        studentEntity.setStudentId( studentIdDtoToStudentId( dto.getStudentId() ) );
        studentEntity.setName( dto.getName() );

        return studentEntity;
    }

    @Override
    public StudentDTO studentEntityToDto(StudentEntity studentEntity) {
        if ( studentEntity == null ) {
            return null;
        }

        StudentDTO studentDTO = new StudentDTO();

        studentDTO.setNiveau( niveauEntityToNiveauDTO( studentEntity.getNiveau() ) );
        studentDTO.setStudentId( studentIdToStudentIdDTO( studentEntity.getStudentId() ) );
        studentDTO.setName( studentEntity.getName() );
        studentDTO.setCourses( courseEntityListToCourseDTOList( studentEntity.getCourses() ) );
        studentDTO.setAdresse( adresseToAdresseDTO( studentEntity.getAdresse() ) );

        return studentDTO;
    }

    @Override
    public List<StudentDTO> studentEntiesToDtos(List<StudentEntity> studentEntities) {
        if ( studentEntities == null ) {
            return null;
        }

        List<StudentDTO> list = new ArrayList<StudentDTO>( studentEntities.size() );
        for ( StudentEntity studentEntity : studentEntities ) {
            list.add( studentEntityToDto( studentEntity ) );
        }

        return list;
    }

    @Override
    public StudentId studentIdDtoToStudentId(StudentIdDTO studentIdDTO) {
        if ( studentIdDTO == null ) {
            return null;
        }

        StudentId studentId = new StudentId();

        studentId.setId( studentIdDTO.getId() );
        studentId.setCode( studentIdDTO.getCode() );

        return studentId;
    }

    protected CourseEntity courseDTOToCourseEntity(CourseDTO courseDTO) {
        if ( courseDTO == null ) {
            return null;
        }

        CourseEntity courseEntity = new CourseEntity();

        courseEntity.setId( courseDTO.getId() );
        courseEntity.setName( courseDTO.getName() );

        return courseEntity;
    }

    protected List<CourseEntity> courseDTOListToCourseEntityList(List<CourseDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<CourseEntity> list1 = new ArrayList<CourseEntity>( list.size() );
        for ( CourseDTO courseDTO : list ) {
            list1.add( courseDTOToCourseEntity( courseDTO ) );
        }

        return list1;
    }

    protected NiveauEntity niveauDTOToNiveauEntity(NiveauDTO niveauDTO) {
        if ( niveauDTO == null ) {
            return null;
        }

        NiveauEntity niveauEntity = new NiveauEntity();

        niveauEntity.setId( niveauDTO.getId() );
        niveauEntity.setLabel( niveauDTO.getLabel() );

        return niveauEntity;
    }

    protected Adresse adresseDTOToAdresse(AdresseDTO adresseDTO) {
        if ( adresseDTO == null ) {
            return null;
        }

        Adresse adresse = new Adresse();

        adresse.setRue( adresseDTO.getRue() );
        adresse.setAvenue( adresseDTO.getAvenue() );
        adresse.setNumber( adresseDTO.getNumber() );

        return adresse;
    }

    protected NiveauDTO niveauEntityToNiveauDTO(NiveauEntity niveauEntity) {
        if ( niveauEntity == null ) {
            return null;
        }

        NiveauDTO niveauDTO = new NiveauDTO();

        niveauDTO.setId( niveauEntity.getId() );
        niveauDTO.setLabel( niveauEntity.getLabel() );

        return niveauDTO;
    }

    protected StudentIdDTO studentIdToStudentIdDTO(StudentId studentId) {
        if ( studentId == null ) {
            return null;
        }

        StudentIdDTO studentIdDTO = new StudentIdDTO();

        studentIdDTO.setId( studentId.getId() );
        studentIdDTO.setCode( studentId.getCode() );

        return studentIdDTO;
    }

    protected CourseDTO courseEntityToCourseDTO(CourseEntity courseEntity) {
        if ( courseEntity == null ) {
            return null;
        }

        CourseDTO courseDTO = new CourseDTO();

        courseDTO.setId( courseEntity.getId() );
        courseDTO.setName( courseEntity.getName() );

        return courseDTO;
    }

    protected List<CourseDTO> courseEntityListToCourseDTOList(List<CourseEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<CourseDTO> list1 = new ArrayList<CourseDTO>( list.size() );
        for ( CourseEntity courseEntity : list ) {
            list1.add( courseEntityToCourseDTO( courseEntity ) );
        }

        return list1;
    }

    protected AdresseDTO adresseToAdresseDTO(Adresse adresse) {
        if ( adresse == null ) {
            return null;
        }

        AdresseDTO adresseDTO = new AdresseDTO();

        adresseDTO.setRue( adresse.getRue() );
        adresseDTO.setAvenue( adresse.getAvenue() );
        adresseDTO.setNumber( adresse.getNumber() );

        return adresseDTO;
    }
}
