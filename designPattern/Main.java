package designPattern;

import Composite.group;
import Template.GenerateReportTask;
import Template.TransferMoneyTask;
import factory.Shape;
import factory.circle;
import factory.rectangle;
import factory.shapeFactory;
import memento.Editor;
import memento.History;
import strategy.ImageStore;
import strategy.JpegCompressor;
import strategy.blackAndWhite;
import strategy.contrast;
import strategy.pngCompressor;

public class Main {

	public static void main(String[] args) {
		/*
		 * var editor=new Editor(); var history=new History();
		 * editor.setContent("sharif"); history.push(editor.createState());
		 * editor.setContent("omar"); history.push(editor.createState());
		 * editor.setContent("kazi"); history.push(editor.createState());
		 * editor.restore(history.pop()); editor.restore(history.pop());
		 * editor.restore(history.pop());
		 * 
		 * System.out.println(editor.getContent());
		 */
		/*
		 * ImageStore imageStore =new ImageStore(); imageStore.store("file",new
		 * pngCompressor() , new contrast()); imageStore.store("file",new
		 * JpegCompressor() , new blackAndWhite());
		 */
		
		/*
		 * TransferMoneyTask transferMoneyTask=new TransferMoneyTask();
		 * transferMoneyTask.execute(); GenerateReportTask generateReportTask=new
		 * GenerateReportTask(); generateReportTask.execute();
		 */
		
		/*
		 * shapeFactory shapeFactory=new shapeFactory() ;
		 * shapeFactory.createShape("rectangle").draw();
		 */
		var group1=new group();
		group1.add(new Composite.Shape());
		group1.add(new Composite.Shape());
		var group2=new group() ;
		group2.add(new Composite.Shape());
		group2.add(new Composite.Shape());
		
		var group=new group();
		group.add(group1);
		group.add(group2);
		group.render();
		group.move();
	}
	

}
