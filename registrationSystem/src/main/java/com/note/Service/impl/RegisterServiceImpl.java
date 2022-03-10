package com.note.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.note.Dao.RegisterDao;
import com.note.Model.Register;
import com.note.Service.RegisterService;
@Service
public class RegisterServiceImpl implements RegisterService{
	
	@Autowired
	private RegisterDao regDao;
		//����ԤԼ
		public int AddRegister(Register reg) {
			return regDao.AddRegister(reg);
		};
		//��ȡ����ԤԼ��Ϣ
		public List<Register> getAllRegister(){
			return regDao.getAllRegister();
		};
		
		public List<Register> getAllRegisterByName(String hzUsername){
			return regDao.getAllRegisterByName(hzUsername);
		};
		//����ԤԼ״̬
		public int UpdateghStatus(Register reg){
			return regDao.UpdateghStatus(reg);
		};
		//ɾ��ԤԼ��¼
		public int UpdateStatus(Register reg) {
			return regDao.UpdateStatus(reg);
		};
		//����id�鿴ԤԼ��Ϣ
		public Register getRegById(Integer id) {
			return regDao.getRegById(id);
		};
}
