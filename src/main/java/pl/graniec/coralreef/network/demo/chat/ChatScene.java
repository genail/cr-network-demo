/**
 * Copyright (c) 2009, Coral Reef Project
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *  * Neither the name of the Coral Reef Project nor the names of its
 *    contributors may be used to endorse or promote products derived from this
 *    software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package pl.graniec.coralreef.network.demo.chat;


import pulpcore.animation.Color;
import pulpcore.animation.Easing;
import pulpcore.animation.Timeline;
import pulpcore.image.CoreFont;
import pulpcore.scene.Scene2D;
import pulpcore.sprite.ImageSprite;
import pulpcore.sprite.Label;
import pulpcore.sprite.ScrollPane;
import pulpcore.sprite.Sprite;
import pulpcore.sprite.TextField;

/**
 * @author Piotr Korzuszek <piotr.korzuszek@gmail.com>
 *
 */
public class ChatScene extends Scene2D {
	
	private static final String BG_RESOURCE = "/pl/graniec/coralreef/network/demo/chat/resources/bg.png";
	private static final String FRAMES_RESOURCE = "/pl/graniec/coralreef/network/demo/chat/resources/frames.png";
	
	private ImageSprite background;
	private ImageSprite frames;
	
	final private Timeline timeline = new Timeline();
	
	int chatLines = 0;
	private ScrollPane chatScroll;
	
	@Override
	public void load() {
		background = new ImageSprite(BG_RESOURCE, 0, 0);
		add(background);
		
		frames = new ImageSprite(FRAMES_RESOURCE, 0, 0);
		frames.alpha.set(0);
		add(frames);
		
		chatScroll = new ScrollPane(20, 20, 450, 400);
		add(chatScroll);
		
//		Label chatLabel = new Label(CoreFont.getSystemFont().tint(0xFFFFFF), "Hello World\na\na\na\na\na\na", 0, 0);
//		chatScroll.add(chatLabel);
		
		addChatLine("Raz", 0xFFFFFF);
		addChatLine("Dwa", 0xFFFFFF);
		addChatLine("Trzy", 0xFFFFFF);
		addChatLine("Raz", 0xFFFFFF);
		addChatLine("Dwa", 0xFFFFFF);
		addChatLine("Trzy", 0xFFFFFF);
		addChatLine("Raz", 0xFFFFFF);
		addChatLine("Dwa", 0xFFFFFF);
		addChatLine("Trzy", 0xFFFFFF);
		addChatLine("Raz", 0xFFFFFF);
		addChatLine("Dwa", 0xFFFFFF);
		addChatLine("Trzy", 0xFFFFFF);
		addChatLine("Raz", 0xFFFFFF);
		addChatLine("Dwa", 0xFFFFFF);
		addChatLine("Trzy", 0xFFFFFF);
		addChatLine("Raz", 0xFFFFFF);
		addChatLine("Dwa", 0xFFFFFF);
		addChatLine("Trzy", 0xFFFFFF);
		addChatLine("Raz", 0xFFFFFF);
		addChatLine("Dwa", 0xFFFFFF);
		addChatLine("Trzy", 0xFFFFFF);
		addChatLine("Raz", 0xFFFFFF);
		addChatLine("Dwa", 0xFFFFFF);
		addChatLine("Trzy", 0xFFFFFF);
		addChatLine("Raz", 0xFFFFFF);
		addChatLine("Dwa", 0xFFFFFF);
		addChatLine("Trzy", 0xFFFFFF);
		addChatLine("Raz", 0xFFFFFF);
		addChatLine("Dwa", 0xFFFFFF);
		addChatLine("Trzy", 0xFFFFFF);
		addChatLine("Raz", 0xFFFFFF);
		addChatLine("Dwa", 0xFFFFFF);
		addChatLine("Trzy", 0xFFFFFF);
		addChatLine("Raz", 0xFFFFFF);
		addChatLine("Dwa", 0xFFFFFF);
		addChatLine("Trzy", 0xFFFFFF);
		
		TextField input = new TextField(
				CoreFont.getSystemFont().tint(0xFFFFFF),
				CoreFont.getSystemFont().tint(0xFF0000),
				"test",
				20, 460, 450, CoreFont.getSystemFont().getHeight()
		);
		
		input.caretColor.set(0xFFFFFFFF);
		input.setAnchor(Sprite.SOUTH_WEST);
		
		add(input);
		
		timeline.animate(background.alpha, 0, 255, 1000);
		timeline.animate(frames.alpha, 0, 255, 1000, Easing.NONE, 1000);
		
		timeline.play();
		
	}
	
	@Override
	public void update(int elapsedTime) {
		timeline.update(elapsedTime);
	}
	
	public void addChatLine(String text, int color) {
		Label label = new Label(CoreFont.getSystemFont().tint(color), text, 0, 0);
		label.y.set((label.height.get() + 3) * chatLines);
		
		chatScroll.add(label);
		
		++chatLines;
	}
}
