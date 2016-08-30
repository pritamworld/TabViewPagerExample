
package com.adesa.interview.tabviewpagerexample.exampleloopj.models;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class ConditionReport {

    @SerializedName("conditionReportId")
    @Expose
    private long conditionReportId;
    @SerializedName("autoCheckURL")
    @Expose
    private String autoCheckURL;
    @SerializedName("vin")
    @Expose
    private String vin;
    @SerializedName("make")
    @Expose
    private String make;
    @SerializedName("model")
    @Expose
    private String model;
    @SerializedName("year")
    @Expose
    private long year;
    @SerializedName("vehicleType")
    @Expose
    private String vehicleType;
    @SerializedName("isSaleLightGreen")
    @Expose
    private boolean isSaleLightGreen;
    @SerializedName("isSaleLightBlue")
    @Expose
    private boolean isSaleLightBlue;
    @SerializedName("isSaleLightRed")
    @Expose
    private boolean isSaleLightRed;
    @SerializedName("isSaleLightWhite")
    @Expose
    private boolean isSaleLightWhite;
    @SerializedName("isSaleLightYellow")
    @Expose
    private boolean isSaleLightYellow;
    @SerializedName("inventorySource")
    @Expose
    private String inventorySource;
    @SerializedName("vehicleTypeGroup")
    @Expose
    private String vehicleTypeGroup;
    @SerializedName("inspectionImageDTO")
    @Expose
    private List<InspectionImageDTO> inspectionImageDTO = new ArrayList<InspectionImageDTO>();
    @SerializedName("vehicleInformation")
    @Expose
    private VehicleInformation vehicleInformation;
    @SerializedName("options")
    @Expose
    private Options options;
    @SerializedName("accessoriesList")
    @Expose
    private List<String> accessoriesList = new ArrayList<String>();
    @SerializedName("tires")
    @Expose
    private List<Tire> tires = new ArrayList<Tire>();
    @SerializedName("additionalInformation")
    @Expose
    private AdditionalInformation additionalInformation;
    @SerializedName("vehicleConditions")
    @Expose
    private List<VehicleCondition> vehicleConditions = new ArrayList<VehicleCondition>();
    @SerializedName("oemInformation")
    @Expose
    private List<OemInformation> oemInformation = new ArrayList<OemInformation>();
    @SerializedName("gradeScale")
    @Expose
    private String gradeScale;
    @SerializedName("estimatedGrandTotal")
    @Expose
    private long estimatedGrandTotal;
    @SerializedName("normalWearAndTearGrandTotal")
    @Expose
    private double normalWearAndTearGrandTotal;
    @SerializedName("excessWearAndTearGrandTotal")
    @Expose
    private double excessWearAndTearGrandTotal;
    @SerializedName("internetReady")
    @Expose
    private boolean internetReady;
    @SerializedName("transportationQuoteDTOs")
    @Expose
    private List<TransportationQuoteDTO> transportationQuoteDTOs = new ArrayList<TransportationQuoteDTO>();
    @SerializedName("consignorInformation")
    @Expose
    private ConsignorInformation consignorInformation;
    @SerializedName("inspectedDate")
    @Expose
    private long inspectedDate;
    @SerializedName("dealerId")
    @Expose
    private long dealerId;
    @SerializedName("partRate")
    @Expose
    private String partRate;
    @SerializedName("paintRate")
    @Expose
    private String paintRate;
    @SerializedName("isNoteAvailable")
    @Expose
    private boolean isNoteAvailable;
    @SerializedName("region")
    @Expose
    private String region;
    @SerializedName("branch")
    @Expose
    private String branch;
    @SerializedName("isPreTermInspection")
    @Expose
    private boolean isPreTermInspection;
    @SerializedName("adminFee")
    @Expose
    private long adminFee;
    @SerializedName("autoGradeAvailable")
    @Expose
    private boolean autoGradeAvailable;
    @SerializedName("arbRequest")
    @Expose
    private boolean arbRequest;
    @SerializedName("optionsEntrySet")
    @Expose
    private List<OptionsEntrySet> optionsEntrySet = new ArrayList<OptionsEntrySet>();
    @SerializedName("inspectionDate")
    @Expose
    private String inspectionDate;

    /**
     * 
     * @return
     *     The conditionReportId
     */
    public long getConditionReportId() {
        return conditionReportId;
    }

    /**
     * 
     * @param conditionReportId
     *     The conditionReportId
     */
    public void setConditionReportId(long conditionReportId) {
        this.conditionReportId = conditionReportId;
    }

    /**
     * 
     * @return
     *     The autoCheckURL
     */
    public String getAutoCheckURL() {
        return autoCheckURL;
    }

    /**
     * 
     * @param autoCheckURL
     *     The autoCheckURL
     */
    public void setAutoCheckURL(String autoCheckURL) {
        this.autoCheckURL = autoCheckURL;
    }

    /**
     * 
     * @return
     *     The vin
     */
    public String getVin() {
        return vin;
    }

    /**
     * 
     * @param vin
     *     The vin
     */
    public void setVin(String vin) {
        this.vin = vin;
    }

    /**
     * 
     * @return
     *     The make
     */
    public String getMake() {
        return make;
    }

    /**
     * 
     * @param make
     *     The make
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * 
     * @return
     *     The model
     */
    public String getModel() {
        return model;
    }

    /**
     * 
     * @param model
     *     The model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * 
     * @return
     *     The year
     */
    public long getYear() {
        return year;
    }

    /**
     * 
     * @param year
     *     The year
     */
    public void setYear(long year) {
        this.year = year;
    }

    /**
     * 
     * @return
     *     The vehicleType
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * 
     * @param vehicleType
     *     The vehicleType
     */
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    /**
     * 
     * @return
     *     The isSaleLightGreen
     */
    public boolean isIsSaleLightGreen() {
        return isSaleLightGreen;
    }

    /**
     * 
     * @param isSaleLightGreen
     *     The isSaleLightGreen
     */
    public void setIsSaleLightGreen(boolean isSaleLightGreen) {
        this.isSaleLightGreen = isSaleLightGreen;
    }

    /**
     * 
     * @return
     *     The isSaleLightBlue
     */
    public boolean isIsSaleLightBlue() {
        return isSaleLightBlue;
    }

    /**
     * 
     * @param isSaleLightBlue
     *     The isSaleLightBlue
     */
    public void setIsSaleLightBlue(boolean isSaleLightBlue) {
        this.isSaleLightBlue = isSaleLightBlue;
    }

    /**
     * 
     * @return
     *     The isSaleLightRed
     */
    public boolean isIsSaleLightRed() {
        return isSaleLightRed;
    }

    /**
     * 
     * @param isSaleLightRed
     *     The isSaleLightRed
     */
    public void setIsSaleLightRed(boolean isSaleLightRed) {
        this.isSaleLightRed = isSaleLightRed;
    }

    /**
     * 
     * @return
     *     The isSaleLightWhite
     */
    public boolean isIsSaleLightWhite() {
        return isSaleLightWhite;
    }

    /**
     * 
     * @param isSaleLightWhite
     *     The isSaleLightWhite
     */
    public void setIsSaleLightWhite(boolean isSaleLightWhite) {
        this.isSaleLightWhite = isSaleLightWhite;
    }

    /**
     * 
     * @return
     *     The isSaleLightYellow
     */
    public boolean isIsSaleLightYellow() {
        return isSaleLightYellow;
    }

    /**
     * 
     * @param isSaleLightYellow
     *     The isSaleLightYellow
     */
    public void setIsSaleLightYellow(boolean isSaleLightYellow) {
        this.isSaleLightYellow = isSaleLightYellow;
    }

    /**
     * 
     * @return
     *     The inventorySource
     */
    public String getInventorySource() {
        return inventorySource;
    }

    /**
     * 
     * @param inventorySource
     *     The inventorySource
     */
    public void setInventorySource(String inventorySource) {
        this.inventorySource = inventorySource;
    }

    /**
     * 
     * @return
     *     The vehicleTypeGroup
     */
    public String getVehicleTypeGroup() {
        return vehicleTypeGroup;
    }

    /**
     * 
     * @param vehicleTypeGroup
     *     The vehicleTypeGroup
     */
    public void setVehicleTypeGroup(String vehicleTypeGroup) {
        this.vehicleTypeGroup = vehicleTypeGroup;
    }

    /**
     * 
     * @return
     *     The inspectionImageDTO
     */
    public List<InspectionImageDTO> getInspectionImageDTO() {
        return inspectionImageDTO;
    }

    /**
     * 
     * @param inspectionImageDTO
     *     The inspectionImageDTO
     */
    public void setInspectionImageDTO(List<InspectionImageDTO> inspectionImageDTO) {
        this.inspectionImageDTO = inspectionImageDTO;
    }

    /**
     * 
     * @return
     *     The vehicleInformation
     */
    public VehicleInformation getVehicleInformation() {
        return vehicleInformation;
    }

    /**
     * 
     * @param vehicleInformation
     *     The vehicleInformation
     */
    public void setVehicleInformation(VehicleInformation vehicleInformation) {
        this.vehicleInformation = vehicleInformation;
    }

    /**
     * 
     * @return
     *     The options
     */
    public Options getOptions() {
        return options;
    }

    /**
     * 
     * @param options
     *     The options
     */
    public void setOptions(Options options) {
        this.options = options;
    }

    /**
     * 
     * @return
     *     The accessoriesList
     */
    public List<String> getAccessoriesList() {
        return accessoriesList;
    }

    /**
     * 
     * @param accessoriesList
     *     The accessoriesList
     */
    public void setAccessoriesList(List<String> accessoriesList) {
        this.accessoriesList = accessoriesList;
    }

    /**
     * 
     * @return
     *     The tires
     */
    public List<Tire> getTires() {
        return tires;
    }

    /**
     * 
     * @param tires
     *     The tires
     */
    public void setTires(List<Tire> tires) {
        this.tires = tires;
    }

    /**
     * 
     * @return
     *     The additionalInformation
     */
    public AdditionalInformation getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * 
     * @param additionalInformation
     *     The additionalInformation
     */
    public void setAdditionalInformation(AdditionalInformation additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    /**
     * 
     * @return
     *     The vehicleConditions
     */
    public List<VehicleCondition> getVehicleConditions() {
        return vehicleConditions;
    }

    /**
     * 
     * @param vehicleConditions
     *     The vehicleConditions
     */
    public void setVehicleConditions(List<VehicleCondition> vehicleConditions) {
        this.vehicleConditions = vehicleConditions;
    }

    /**
     * 
     * @return
     *     The oemInformation
     */
    public List<OemInformation> getOemInformation() {
        return oemInformation;
    }

    /**
     * 
     * @param oemInformation
     *     The oemInformation
     */
    public void setOemInformation(List<OemInformation> oemInformation) {
        this.oemInformation = oemInformation;
    }

    /**
     * 
     * @return
     *     The gradeScale
     */
    public String getGradeScale() {
        return gradeScale;
    }

    /**
     * 
     * @param gradeScale
     *     The gradeScale
     */
    public void setGradeScale(String gradeScale) {
        this.gradeScale = gradeScale;
    }

    /**
     * 
     * @return
     *     The estimatedGrandTotal
     */
    public long getEstimatedGrandTotal() {
        return estimatedGrandTotal;
    }

    /**
     * 
     * @param estimatedGrandTotal
     *     The estimatedGrandTotal
     */
    public void setEstimatedGrandTotal(long estimatedGrandTotal) {
        this.estimatedGrandTotal = estimatedGrandTotal;
    }

    /**
     * 
     * @return
     *     The normalWearAndTearGrandTotal
     */
    public double getNormalWearAndTearGrandTotal() {
        return normalWearAndTearGrandTotal;
    }

    /**
     * 
     * @param normalWearAndTearGrandTotal
     *     The normalWearAndTearGrandTotal
     */
    public void setNormalWearAndTearGrandTotal(double normalWearAndTearGrandTotal) {
        this.normalWearAndTearGrandTotal = normalWearAndTearGrandTotal;
    }

    /**
     * 
     * @return
     *     The excessWearAndTearGrandTotal
     */
    public double getExcessWearAndTearGrandTotal() {
        return excessWearAndTearGrandTotal;
    }

    /**
     * 
     * @param excessWearAndTearGrandTotal
     *     The excessWearAndTearGrandTotal
     */
    public void setExcessWearAndTearGrandTotal(double excessWearAndTearGrandTotal) {
        this.excessWearAndTearGrandTotal = excessWearAndTearGrandTotal;
    }

    /**
     * 
     * @return
     *     The internetReady
     */
    public boolean isInternetReady() {
        return internetReady;
    }

    /**
     * 
     * @param internetReady
     *     The internetReady
     */
    public void setInternetReady(boolean internetReady) {
        this.internetReady = internetReady;
    }

    /**
     * 
     * @return
     *     The transportationQuoteDTOs
     */
    public List<TransportationQuoteDTO> getTransportationQuoteDTOs() {
        return transportationQuoteDTOs;
    }

    /**
     * 
     * @param transportationQuoteDTOs
     *     The transportationQuoteDTOs
     */
    public void setTransportationQuoteDTOs(List<TransportationQuoteDTO> transportationQuoteDTOs) {
        this.transportationQuoteDTOs = transportationQuoteDTOs;
    }

    /**
     * 
     * @return
     *     The consignorInformation
     */
    public ConsignorInformation getConsignorInformation() {
        return consignorInformation;
    }

    /**
     * 
     * @param consignorInformation
     *     The consignorInformation
     */
    public void setConsignorInformation(ConsignorInformation consignorInformation) {
        this.consignorInformation = consignorInformation;
    }

    /**
     * 
     * @return
     *     The inspectedDate
     */
    public long getInspectedDate() {
        return inspectedDate;
    }

    /**
     * 
     * @param inspectedDate
     *     The inspectedDate
     */
    public void setInspectedDate(long inspectedDate) {
        this.inspectedDate = inspectedDate;
    }

    /**
     * 
     * @return
     *     The dealerId
     */
    public long getDealerId() {
        return dealerId;
    }

    /**
     * 
     * @param dealerId
     *     The dealerId
     */
    public void setDealerId(long dealerId) {
        this.dealerId = dealerId;
    }

    /**
     * 
     * @return
     *     The partRate
     */
    public String getPartRate() {
        return partRate;
    }

    /**
     * 
     * @param partRate
     *     The partRate
     */
    public void setPartRate(String partRate) {
        this.partRate = partRate;
    }

    /**
     * 
     * @return
     *     The paintRate
     */
    public String getPaintRate() {
        return paintRate;
    }

    /**
     * 
     * @param paintRate
     *     The paintRate
     */
    public void setPaintRate(String paintRate) {
        this.paintRate = paintRate;
    }

    /**
     * 
     * @return
     *     The isNoteAvailable
     */
    public boolean isIsNoteAvailable() {
        return isNoteAvailable;
    }

    /**
     * 
     * @param isNoteAvailable
     *     The isNoteAvailable
     */
    public void setIsNoteAvailable(boolean isNoteAvailable) {
        this.isNoteAvailable = isNoteAvailable;
    }

    /**
     * 
     * @return
     *     The region
     */
    public String getRegion() {
        return region;
    }

    /**
     * 
     * @param region
     *     The region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * 
     * @return
     *     The branch
     */
    public String getBranch() {
        return branch;
    }

    /**
     * 
     * @param branch
     *     The branch
     */
    public void setBranch(String branch) {
        this.branch = branch;
    }

    /**
     * 
     * @return
     *     The isPreTermInspection
     */
    public boolean isIsPreTermInspection() {
        return isPreTermInspection;
    }

    /**
     * 
     * @param isPreTermInspection
     *     The isPreTermInspection
     */
    public void setIsPreTermInspection(boolean isPreTermInspection) {
        this.isPreTermInspection = isPreTermInspection;
    }

    /**
     * 
     * @return
     *     The adminFee
     */
    public long getAdminFee() {
        return adminFee;
    }

    /**
     * 
     * @param adminFee
     *     The adminFee
     */
    public void setAdminFee(long adminFee) {
        this.adminFee = adminFee;
    }

    /**
     * 
     * @return
     *     The autoGradeAvailable
     */
    public boolean isAutoGradeAvailable() {
        return autoGradeAvailable;
    }

    /**
     * 
     * @param autoGradeAvailable
     *     The autoGradeAvailable
     */
    public void setAutoGradeAvailable(boolean autoGradeAvailable) {
        this.autoGradeAvailable = autoGradeAvailable;
    }

    /**
     * 
     * @return
     *     The arbRequest
     */
    public boolean isArbRequest() {
        return arbRequest;
    }

    /**
     * 
     * @param arbRequest
     *     The arbRequest
     */
    public void setArbRequest(boolean arbRequest) {
        this.arbRequest = arbRequest;
    }

    /**
     * 
     * @return
     *     The optionsEntrySet
     */
    public List<OptionsEntrySet> getOptionsEntrySet() {
        return optionsEntrySet;
    }

    /**
     * 
     * @param optionsEntrySet
     *     The optionsEntrySet
     */
    public void setOptionsEntrySet(List<OptionsEntrySet> optionsEntrySet) {
        this.optionsEntrySet = optionsEntrySet;
    }

    /**
     * 
     * @return
     *     The inspectionDate
     */
    public String getInspectionDate() {
        return inspectionDate;
    }

    /**
     * 
     * @param inspectionDate
     *     The inspectionDate
     */
    public void setInspectionDate(String inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
