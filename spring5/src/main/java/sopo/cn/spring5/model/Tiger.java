package sopo.cn.spring5.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Tiger {
	private String tigerName;

	public String getTigerName() {
		return tigerName;
	}
	@Value("tg1")
	public void setTigerName(String tigerName) {
		this.tigerName = tigerName;
	}
	@Override
	public String toString() {
		return "Tiger [tigerName=" + tigerName + "]";
	}
	
}
