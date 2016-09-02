
/*
 * Copyright (c) 2016. Pritesh Patel
 */

package com.adesa.interview.tabviewpagerexample.exampleloopj.models;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The type Condition report.
 */
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
     * Gets condition report id.
     *
     * @return The conditionReportId
     */
    public long getConditionReportId() {
        return conditionReportId;
    }

    /**
     * Sets condition report id.
     *
     * @param conditionReportId The conditionReportId
     */
    public void setConditionReportId(long conditionReportId) {
        this.conditionReportId = conditionReportId;
    }

    /**
     * Gets auto check url.
     *
     * @return The autoCheckURL
     */
    public String getAutoCheckURL() {
        return autoCheckURL;
    }

    /**
     * Sets auto check url.
     *
     * @param autoCheckURL The autoCheckURL
     */
    public void setAutoCheckURL(String autoCheckURL) {
        this.autoCheckURL = autoCheckURL;
    }

    /**
     * Gets vin.
     *
     * @return The vin
     */
    public String getVin() {
        return vin;
    }

    /**
     * Sets vin.
     *
     * @param vin The vin
     */
    public void setVin(String vin) {
        this.vin = vin;
    }

    /**
     * Gets make.
     *
     * @return The make
     */
    public String getMake() {
        return make;
    }

    /**
     * Sets make.
     *
     * @param make The make
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Gets model.
     *
     * @return The model
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets model.
     *
     * @param model The model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Gets year.
     *
     * @return The year
     */
    public long getYear() {
        return year;
    }

    /**
     * Sets year.
     *
     * @param year The year
     */
    public void setYear(long year) {
        this.year = year;
    }

    /**
     * Gets vehicle type.
     *
     * @return The vehicleType
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * Sets vehicle type.
     *
     * @param vehicleType The vehicleType
     */
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    /**
     * Is is sale light green boolean.
     *
     * @return The isSaleLightGreen
     */
    public boolean isIsSaleLightGreen() {
        return isSaleLightGreen;
    }

    /**
     * Sets is sale light green.
     *
     * @param isSaleLightGreen The isSaleLightGreen
     */
    public void setIsSaleLightGreen(boolean isSaleLightGreen) {
        this.isSaleLightGreen = isSaleLightGreen;
    }

    /**
     * Is is sale light blue boolean.
     *
     * @return The isSaleLightBlue
     */
    public boolean isIsSaleLightBlue() {
        return isSaleLightBlue;
    }

    /**
     * Sets is sale light blue.
     *
     * @param isSaleLightBlue The isSaleLightBlue
     */
    public void setIsSaleLightBlue(boolean isSaleLightBlue) {
        this.isSaleLightBlue = isSaleLightBlue;
    }

    /**
     * Is is sale light red boolean.
     *
     * @return The isSaleLightRed
     */
    public boolean isIsSaleLightRed() {
        return isSaleLightRed;
    }

    /**
     * Sets is sale light red.
     *
     * @param isSaleLightRed The isSaleLightRed
     */
    public void setIsSaleLightRed(boolean isSaleLightRed) {
        this.isSaleLightRed = isSaleLightRed;
    }

    /**
     * Is is sale light white boolean.
     *
     * @return The isSaleLightWhite
     */
    public boolean isIsSaleLightWhite() {
        return isSaleLightWhite;
    }

    /**
     * Sets is sale light white.
     *
     * @param isSaleLightWhite The isSaleLightWhite
     */
    public void setIsSaleLightWhite(boolean isSaleLightWhite) {
        this.isSaleLightWhite = isSaleLightWhite;
    }

    /**
     * Is is sale light yellow boolean.
     *
     * @return The isSaleLightYellow
     */
    public boolean isIsSaleLightYellow() {
        return isSaleLightYellow;
    }

    /**
     * Sets is sale light yellow.
     *
     * @param isSaleLightYellow The isSaleLightYellow
     */
    public void setIsSaleLightYellow(boolean isSaleLightYellow) {
        this.isSaleLightYellow = isSaleLightYellow;
    }

    /**
     * Gets inventory source.
     *
     * @return The inventorySource
     */
    public String getInventorySource() {
        return inventorySource;
    }

    /**
     * Sets inventory source.
     *
     * @param inventorySource The inventorySource
     */
    public void setInventorySource(String inventorySource) {
        this.inventorySource = inventorySource;
    }

    /**
     * Gets vehicle type group.
     *
     * @return The vehicleTypeGroup
     */
    public String getVehicleTypeGroup() {
        return vehicleTypeGroup;
    }

    /**
     * Sets vehicle type group.
     *
     * @param vehicleTypeGroup The vehicleTypeGroup
     */
    public void setVehicleTypeGroup(String vehicleTypeGroup) {
        this.vehicleTypeGroup = vehicleTypeGroup;
    }

    /**
     * Gets inspection image dto.
     *
     * @return The inspectionImageDTO
     */
    public List<InspectionImageDTO> getInspectionImageDTO() {
        return inspectionImageDTO;
    }

    /**
     * Sets inspection image dto.
     *
     * @param inspectionImageDTO The inspectionImageDTO
     */
    public void setInspectionImageDTO(List<InspectionImageDTO> inspectionImageDTO) {
        this.inspectionImageDTO = inspectionImageDTO;
    }

    /**
     * Gets vehicle information.
     *
     * @return The vehicleInformation
     */
    public VehicleInformation getVehicleInformation() {
        return vehicleInformation;
    }

    /**
     * Sets vehicle information.
     *
     * @param vehicleInformation The vehicleInformation
     */
    public void setVehicleInformation(VehicleInformation vehicleInformation) {
        this.vehicleInformation = vehicleInformation;
    }

    /**
     * Gets options.
     *
     * @return The options
     */
    public Options getOptions() {
        return options;
    }

    /**
     * Sets options.
     *
     * @param options The options
     */
    public void setOptions(Options options) {
        this.options = options;
    }

    /**
     * Gets accessories list.
     *
     * @return The accessoriesList
     */
    public List<String> getAccessoriesList() {
        return accessoriesList;
    }

    /**
     * Sets accessories list.
     *
     * @param accessoriesList The accessoriesList
     */
    public void setAccessoriesList(List<String> accessoriesList) {
        this.accessoriesList = accessoriesList;
    }

    /**
     * Gets tires.
     *
     * @return The tires
     */
    public List<Tire> getTires() {
        return tires;
    }

    /**
     * Sets tires.
     *
     * @param tires The tires
     */
    public void setTires(List<Tire> tires) {
        this.tires = tires;
    }

    /**
     * Gets additional information.
     *
     * @return The additionalInformation
     */
    public AdditionalInformation getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets additional information.
     *
     * @param additionalInformation The additionalInformation
     */
    public void setAdditionalInformation(AdditionalInformation additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    /**
     * Gets vehicle conditions.
     *
     * @return The vehicleConditions
     */
    public List<VehicleCondition> getVehicleConditions() {
        return vehicleConditions;
    }

    /**
     * Sets vehicle conditions.
     *
     * @param vehicleConditions The vehicleConditions
     */
    public void setVehicleConditions(List<VehicleCondition> vehicleConditions) {
        this.vehicleConditions = vehicleConditions;
    }

    /**
     * Gets oem information.
     *
     * @return The oemInformation
     */
    public List<OemInformation> getOemInformation() {
        return oemInformation;
    }

    /**
     * Sets oem information.
     *
     * @param oemInformation The oemInformation
     */
    public void setOemInformation(List<OemInformation> oemInformation) {
        this.oemInformation = oemInformation;
    }

    /**
     * Gets grade scale.
     *
     * @return The gradeScale
     */
    public String getGradeScale() {
        return gradeScale;
    }

    /**
     * Sets grade scale.
     *
     * @param gradeScale The gradeScale
     */
    public void setGradeScale(String gradeScale) {
        this.gradeScale = gradeScale;
    }

    /**
     * Gets estimated grand total.
     *
     * @return The estimatedGrandTotal
     */
    public long getEstimatedGrandTotal() {
        return estimatedGrandTotal;
    }

    /**
     * Sets estimated grand total.
     *
     * @param estimatedGrandTotal The estimatedGrandTotal
     */
    public void setEstimatedGrandTotal(long estimatedGrandTotal) {
        this.estimatedGrandTotal = estimatedGrandTotal;
    }

    /**
     * Gets normal wear and tear grand total.
     *
     * @return The normalWearAndTearGrandTotal
     */
    public double getNormalWearAndTearGrandTotal() {
        return normalWearAndTearGrandTotal;
    }

    /**
     * Sets normal wear and tear grand total.
     *
     * @param normalWearAndTearGrandTotal The normalWearAndTearGrandTotal
     */
    public void setNormalWearAndTearGrandTotal(double normalWearAndTearGrandTotal) {
        this.normalWearAndTearGrandTotal = normalWearAndTearGrandTotal;
    }

    /**
     * Gets excess wear and tear grand total.
     *
     * @return The excessWearAndTearGrandTotal
     */
    public double getExcessWearAndTearGrandTotal() {
        return excessWearAndTearGrandTotal;
    }

    /**
     * Sets excess wear and tear grand total.
     *
     * @param excessWearAndTearGrandTotal The excessWearAndTearGrandTotal
     */
    public void setExcessWearAndTearGrandTotal(double excessWearAndTearGrandTotal) {
        this.excessWearAndTearGrandTotal = excessWearAndTearGrandTotal;
    }

    /**
     * Is internet ready boolean.
     *
     * @return The internetReady
     */
    public boolean isInternetReady() {
        return internetReady;
    }

    /**
     * Sets internet ready.
     *
     * @param internetReady The internetReady
     */
    public void setInternetReady(boolean internetReady) {
        this.internetReady = internetReady;
    }

    /**
     * Gets transportation quote dt os.
     *
     * @return The transportationQuoteDTOs
     */
    public List<TransportationQuoteDTO> getTransportationQuoteDTOs() {
        return transportationQuoteDTOs;
    }

    /**
     * Sets transportation quote dt os.
     *
     * @param transportationQuoteDTOs The transportationQuoteDTOs
     */
    public void setTransportationQuoteDTOs(List<TransportationQuoteDTO> transportationQuoteDTOs) {
        this.transportationQuoteDTOs = transportationQuoteDTOs;
    }

    /**
     * Gets consignor information.
     *
     * @return The consignorInformation
     */
    public ConsignorInformation getConsignorInformation() {
        return consignorInformation;
    }

    /**
     * Sets consignor information.
     *
     * @param consignorInformation The consignorInformation
     */
    public void setConsignorInformation(ConsignorInformation consignorInformation) {
        this.consignorInformation = consignorInformation;
    }

    /**
     * Gets inspected date.
     *
     * @return The inspectedDate
     */
    public long getInspectedDate() {
        return inspectedDate;
    }

    /**
     * Sets inspected date.
     *
     * @param inspectedDate The inspectedDate
     */
    public void setInspectedDate(long inspectedDate) {
        this.inspectedDate = inspectedDate;
    }

    /**
     * Gets dealer id.
     *
     * @return The dealerId
     */
    public long getDealerId() {
        return dealerId;
    }

    /**
     * Sets dealer id.
     *
     * @param dealerId The dealerId
     */
    public void setDealerId(long dealerId) {
        this.dealerId = dealerId;
    }

    /**
     * Gets part rate.
     *
     * @return The partRate
     */
    public String getPartRate() {
        return partRate;
    }

    /**
     * Sets part rate.
     *
     * @param partRate The partRate
     */
    public void setPartRate(String partRate) {
        this.partRate = partRate;
    }

    /**
     * Gets paint rate.
     *
     * @return The paintRate
     */
    public String getPaintRate() {
        return paintRate;
    }

    /**
     * Sets paint rate.
     *
     * @param paintRate The paintRate
     */
    public void setPaintRate(String paintRate) {
        this.paintRate = paintRate;
    }

    /**
     * Is is note available boolean.
     *
     * @return The isNoteAvailable
     */
    public boolean isIsNoteAvailable() {
        return isNoteAvailable;
    }

    /**
     * Sets is note available.
     *
     * @param isNoteAvailable The isNoteAvailable
     */
    public void setIsNoteAvailable(boolean isNoteAvailable) {
        this.isNoteAvailable = isNoteAvailable;
    }

    /**
     * Gets region.
     *
     * @return The region
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets region.
     *
     * @param region The region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Gets branch.
     *
     * @return The branch
     */
    public String getBranch() {
        return branch;
    }

    /**
     * Sets branch.
     *
     * @param branch The branch
     */
    public void setBranch(String branch) {
        this.branch = branch;
    }

    /**
     * Is is pre term inspection boolean.
     *
     * @return The isPreTermInspection
     */
    public boolean isIsPreTermInspection() {
        return isPreTermInspection;
    }

    /**
     * Sets is pre term inspection.
     *
     * @param isPreTermInspection The isPreTermInspection
     */
    public void setIsPreTermInspection(boolean isPreTermInspection) {
        this.isPreTermInspection = isPreTermInspection;
    }

    /**
     * Gets admin fee.
     *
     * @return The adminFee
     */
    public long getAdminFee() {
        return adminFee;
    }

    /**
     * Sets admin fee.
     *
     * @param adminFee The adminFee
     */
    public void setAdminFee(long adminFee) {
        this.adminFee = adminFee;
    }

    /**
     * Is auto grade available boolean.
     *
     * @return The autoGradeAvailable
     */
    public boolean isAutoGradeAvailable() {
        return autoGradeAvailable;
    }

    /**
     * Sets auto grade available.
     *
     * @param autoGradeAvailable The autoGradeAvailable
     */
    public void setAutoGradeAvailable(boolean autoGradeAvailable) {
        this.autoGradeAvailable = autoGradeAvailable;
    }

    /**
     * Is arb request boolean.
     *
     * @return The arbRequest
     */
    public boolean isArbRequest() {
        return arbRequest;
    }

    /**
     * Sets arb request.
     *
     * @param arbRequest The arbRequest
     */
    public void setArbRequest(boolean arbRequest) {
        this.arbRequest = arbRequest;
    }

    /**
     * Gets options entry set.
     *
     * @return The optionsEntrySet
     */
    public List<OptionsEntrySet> getOptionsEntrySet() {
        return optionsEntrySet;
    }

    /**
     * Sets options entry set.
     *
     * @param optionsEntrySet The optionsEntrySet
     */
    public void setOptionsEntrySet(List<OptionsEntrySet> optionsEntrySet) {
        this.optionsEntrySet = optionsEntrySet;
    }

    /**
     * Gets inspection date.
     *
     * @return The inspectionDate
     */
    public String getInspectionDate() {
        return inspectionDate;
    }

    /**
     * Sets inspection date.
     *
     * @param inspectionDate The inspectionDate
     */
    public void setInspectionDate(String inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
