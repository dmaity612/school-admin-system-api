package com.gpacalc.GpaCalculator.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.gpacalc.GpaCalculator.entity.CalcInfo;
import com.gpacalc.GpaCalculator.entity.Student;
import com.gpacalc.GpaCalculator.entity.StudentRank;

@Repository
public class GpaRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<CalcInfo> getGpaDetails (long studentId){
		String sql = "select student_id, m.course_id, score, level from course c, marks m where c.course_id = m.course_id and student_id = ?";
		return jdbcTemplate.query(sql,new Object[]{studentId},(rs, rowNum) ->
        new CalcInfo
	        (
	          rs.getLong(1),
	          rs.getLong(2),
	          rs.getInt(3),
	          rs.getDouble(4)
	        )
		);

	}
	public List<StudentRank> getRank (long numPpl){
		if (numPpl == 0) {
			String sql = "select * from student ORDER BY gpa DESC";
			return jdbcTemplate.query(sql,new Object[]{},(rs, rowNum) ->
	        new StudentRank
		        (
		          rs.getLong(1),
		          rs.getString(2),
		          rs.getDouble(3),
		          rs.getInt(4),
		          rs.getString(5)
		        )
			);
		}
		else {
			String sql = "select * from student ORDER BY gpa DESC LIMIT ?";
			return jdbcTemplate.query(sql,new Object[]{numPpl},(rs, rowNum) ->
	        new StudentRank
		        (
		          rs.getLong(1),
		          rs.getString(2),
		          rs.getDouble(3),
		          rs.getInt(4),
		          rs.getString(5)
		        )
			);
		}
	}
	
}
