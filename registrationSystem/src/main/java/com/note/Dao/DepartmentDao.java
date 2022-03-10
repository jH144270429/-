package com.note.Dao;

import java.util.List;

import com.note.Model.Department;

/**
 * ����:�û�mapper�ӿ�
 * 
 */
public interface DepartmentDao {
	
	Department selectDeptByName(String deptName);
   
    int AddDepartment(Department dept);
    
    int updateDeptByName(Department dept);
    
    List getAllDeptInfo();
    
    Department getDeptById(Integer id);
    
    int updateDept(Department dept);
    
    int updateDeptStatus(Department dept);
}
