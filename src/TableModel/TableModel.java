package TableModel;

import javax.swing.table.AbstractTableModel;

import View.Plane;

import java.util.ArrayList;
import java.util.List;

public class TableModel extends AbstractTableModel {

	private List<Plane> planes;
    private String[] colunas = new String[]{ "id", "X", "Y", "R", "A", "V", "D"};
    

   public TableModel(List<Plane> planes) {
       this.planes = planes;
   }
    
   public TableModel(){
    this.planes = new ArrayList<Plane>();
   }
 
   public int getRowCount() {
       return planes.size();
   }
 
   public int getColumnCount() {
       return colunas.length;
   }
    
   @Override
   public String getColumnName(int columnIndex){
     return colunas[columnIndex];
   }    
    
    @Override  
   public Class<?> getColumnClass(int columnIndex) {  
       return String.class;  
   }
  
    
   public void setValueAt(Plane aValue, int rowIndex) {  
	   Plane plane = planes.get(rowIndex);
        
	   plane.setId(aValue.getId());
	   plane.setX(aValue.getX());
	   plane.setY(aValue.getY());
	   plane.setRaio(aValue.getRaio());
	   plane.setAngle(aValue.getAngle());
	   plane.setVelocidade(aValue.getVelocidade());
	   plane.setDirection(aValue.getDirection());        
  
       fireTableCellUpdated(rowIndex, 0);  
       fireTableCellUpdated(rowIndex, 1);  
       fireTableCellUpdated(rowIndex, 2);  
       fireTableCellUpdated(rowIndex, 3);  
       fireTableCellUpdated(rowIndex, 4);  
       fireTableCellUpdated(rowIndex, 5);  
       fireTableCellUpdated(rowIndex, 6);  
  
   }
    
     
   public void setValueAt(Object aValue, int rowIndex, int columnIndex) {  
	   Plane plane = planes.get(rowIndex);
  
    switch (columnIndex) {
        case 0:  
        	plane.setId((Integer)aValue);
        case 1:  
        	plane.setX((Double)aValue);
        case 2:  
        	plane.setY((Double)aValue);
        case 3:  
        	plane.setRaio((Double)aValue);
        case 4:  
        	plane.setAngle((Double)aValue);
        case 5:  
        	plane.setVelocidade((Double)aValue);
        case 6:  
        	plane.setDirection((Double)aValue);
                
  
        default:  
            System.err.println("Índice da coluna inválido");
    }  
    fireTableCellUpdated(rowIndex, columnIndex);  
    }      
    
 
   public Object getValueAt(int rowIndex, int columnIndex) {
	   Plane planeSelecionado = planes.get(rowIndex);
	   Object  valueObject = null;
       switch(columnIndex){
       case 0:
			valueObject = planeSelecionado.getId();
			break;
       case 1:
			valueObject = Math.round( planeSelecionado.getX());
			break;
		case 2:
			valueObject = Math.round(planeSelecionado.getY());
			break;
		case 3:
			valueObject = Math.round(planeSelecionado.getRaio());
			break;
		case 4:
			valueObject = Math.round(planeSelecionado.getAngle());
			break;
		case 5:
			valueObject = Math.round(planeSelecionado.getVelocidade());
			break;
		case 6:
			valueObject = Math.round(planeSelecionado.getDirection());
			break;
		default:
			System.err.println("Índice inválido para propriedade do bean Air.class");
		}

		return valueObject;
   }
    
   @Override  
   public boolean isCellEditable(int rowIndex, int columnIndex) {  
       return false;  
   }  
  
  
   public Plane getPlane(int indiceLinha) {  
       return planes.get(indiceLinha);  
   }  
    
   public void addUsuario(Plane p) {      
       planes.add(p);  
  
  
       int ultimoIndice = getRowCount() - 1;  
  
       fireTableRowsInserted(ultimoIndice, ultimoIndice);  
   }  
  
    
   public void removePlane(int indiceLinha) {  
       planes.remove(indiceLinha);  
  
       fireTableRowsDeleted(indiceLinha, indiceLinha);  
   }  
    
    
   public void addListaDePlanes(List<Plane> novosUsuarios) {  
        
       int tamanhoAntigo = getRowCount();      
       planes.addAll(novosUsuarios);    
       fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);  
   }  
    
   public void limpar() {  
       planes.clear();    
       fireTableDataChanged();  
   }  
  
   public boolean isEmpty() {  
       return planes.isEmpty();  
   }  
    
}


