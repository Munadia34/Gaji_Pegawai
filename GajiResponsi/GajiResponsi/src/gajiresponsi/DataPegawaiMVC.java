
package gajiresponsi;

public class DataPegawaiMVC {
    DataPegawaiView datapegawaiview = new DataPegawaiView();
    DataPegawaiModel datapegawaimodel = new DataPegawaiModel();
    DataPegawaiDAO datapegawaidao = new DataPegawaiDAO();
    DataPegawaiController datapegawaicontroller = new DataPegawaiController(datapegawaiview, datapegawaidao, datapegawaimodel);
}
