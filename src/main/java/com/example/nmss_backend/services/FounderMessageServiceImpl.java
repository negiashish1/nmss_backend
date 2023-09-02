package com.example.nmss_backend.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.nmss_backend.entities.FounderMessage;

@Service
public class FounderMessageServiceImpl implements FounderMessageService{
	
	public List<FounderMessage> founderMessageList;
	
	public FounderMessageServiceImpl() {
		
		founderMessageList = new ArrayList<>();
		founderMessageList.add(new FounderMessage("संतोषी मडवाल", "नारायणी महिला शक्ति संगठन उत्तराखंड, भारत, और उससे परे में आशा और परिवर्तन की प्रकाशक के रूप में खड़ा है। उनके प्रयासों के माध्यम से, मीटिंगों, कार्यशालाओं, और खुले कार्यक्रमों की आयोजन में, संगठन घरेलू महिलाओं के समृद्धि की ओर प्रामुखता से काम कर रहा है, गरीब बच्चों के सशक्तिकरण की दिशा में अपने प्रयास कर रहा है, और उत्तराखंड की सांस्कृतिक धरोहर को बढ़ावा देने में सहायक हो रहा है। समावेशी और समग्र दृष्टिकोण को अपनाकर, वे एक भविष्य की प्रेरणा देते हैं जहां महिलाएँ सफलता प्राप्त करती हैं, बच्चे विकसित होते हैं, और सांस्कृतिक विविधता का समर्थन किया जाता है, जिससे समृद्धि और समानता से भरपूर समाज की नींव रखी जा सके। हम अन्य लोगों को हमारे संस्थान में शामिल होने की स्वागत करते हैं।"));
	}

	@Override
	public List<FounderMessage> getFounderMessage() {
		// TODO Auto-generated method stub
		return founderMessageList;
	}

}
