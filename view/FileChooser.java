package view;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileChooser {
	String filepath = "";
			
	public String promptUserForFile() {
			try {
			JFileChooser fileOpen = new JFileChooser("Desktop\\News and Opinion Corpus - Ralph Regalado");
			String[] suffices = ImageIO.getReaderFileSuffixes();
				for (int i = 0; i < suffices.length; i++)
				{
					FileFilter filter = new FileNameExtensionFilter(
							suffices[i] + " files", suffices[i]);
					fileOpen.addChoosableFileFilter(filter);
				}
			int ret = fileOpen.showDialog(null, "Open file");
			filepath = fileOpen.getSelectedFile().getAbsolutePath();
		
		} catch (Exception exc)
		{
			System.out.println(filepath);
		}
		System.out.println(filepath);
		return filepath;
	}
		                
}

