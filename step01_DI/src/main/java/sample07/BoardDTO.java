package sample07;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Component
@Scope("prototype")
@NoArgsConstructor
@AllArgsConstructor
public class BoardDTO {
	@Value("10")
	private int no;
	
	@Value("ewr2")
	private String subject;
	
	@Value("ewr2")
	private String content;
	
	
}
