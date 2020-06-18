package TableModel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import Model.Airplane;


public class AirplaneTableModel extends AbstractTableModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6434323692626647075L;
	private List<Airplane> airplanes;
	private String[] colunas = new String[] {"X", "Y", "R", "A", "V", "D" };
	

	public AirplaneTableModel(List<Airplane> airplanes) {
		this.airplanes = airplanes;
	}

	public AirplaneTableModel() {
		this.airplanes = new ArrayList<Airplane>();
	}

	public int getRowCount() {
		return airplanes.size();
	}

	public int getColumnCount() {
		return colunas.length;
	}

	public String getColumnName(int columnIndex) {
		return colunas[columnIndex];
	}

	public Class<?> getColumnClass(int columnIndex) {
		return String.class;
	}

	public void setValueAt(Airplane aValue, int rowIndex) {
		Airplane airplane = airplanes.get(rowIndex);

		airplane.setxPosition(aValue.getxPosition());
		airplane.setyPosition(aValue.getyPosition());
		airplane.setRadius(aValue.getRadius());
		airplane.setAngle(aValue.getAngle());
		airplane.setSpeed(aValue.getSpeed());
		airplane.setDirection(aValue.getDirection());

		fireTableCellUpdated(rowIndex, 0);
		fireTableCellUpdated(rowIndex, 1);
		fireTableCellUpdated(rowIndex, 2);
		fireTableCellUpdated(rowIndex, 3);
		fireTableCellUpdated(rowIndex, 4);
		fireTableCellUpdated(rowIndex, 5);
	}

	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		Airplane airplane = airplanes.get(rowIndex);

		switch (columnIndex) {
		case 0:
			airplane.setxPosition((Double) aValue);
		case 1:
			airplane.setyPosition((Double) aValue);
		case 2:
			airplane.setRadius((Double) aValue);
		case 3:
			airplane.setAngle((Double) aValue);
		case 4:
			airplane.setSpeed((Double) aValue);
		case 5:
			airplane.setDirection((Double) aValue);
		default:
			System.err.println("Índice da coluna inválido");
		}
		fireTableCellUpdated(rowIndex, columnIndex);
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		Airplane airplaneSelecionado = airplanes.get(rowIndex);
		Object valueObject = null;
		switch (columnIndex) {
		case 0:
			valueObject = airplaneSelecionado.getxPosition();
			break;
		case 1:
			valueObject = airplaneSelecionado.getyPosition();
			break;
		case 2:
			valueObject = airplaneSelecionado.getRadius();
			break;
		case 3:
			valueObject = airplaneSelecionado.getAngle();
			break;
		case 4:
			valueObject = airplaneSelecionado.getSpeed();
			break;
		case 5:
			valueObject = airplaneSelecionado.getDirection();
			break;
		default:
			System.err.println("Índice inválido para propriedade do bean Airplanes.class");
		}

		return valueObject;
	}

	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

	public Airplane getAluno(int indiceLinha) {
		return airplanes.get(indiceLinha);
	}

	public void addAluno(Airplane u) {
		airplanes.add(u);

		int ultimoIndice = getRowCount() - 1;

		fireTableRowsInserted(ultimoIndice, ultimoIndice);
	}

	public void removeAluno(int indiceLinha) {
		airplanes.remove(indiceLinha);

		fireTableRowsDeleted(indiceLinha, indiceLinha);
	}

	public void addListaDeAirplanes(List<Airplane> novosAirplanes) {

		int tamanhoAntigo = getRowCount();
		airplanes.addAll(novosAirplanes);
		fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
	}

	public void limpar() {
		airplanes.clear();
		fireTableDataChanged();
	}

	public boolean isEmpty() {
		return airplanes.isEmpty();
	}
	

}
