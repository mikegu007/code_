$(function() {

    $("#demo_grid1").bs_grid({
        ajaxFetchDataURL: basePath+"customer/historyList.do",
        pageNum: 1,
        rowsPerPage: 10,
        maxRowsPerPage: 100,
        rowSelectionMode: "single",
        useFilters: false,
        showSortingIndicator: false,
        useSortableLists: false,
        row_primary_key: "id",
        columns: [
            {field: "id", header: "id"},
            {field: "companyNo", header: "CompanyNo"},
            {field: "countryId", header: "CountryId", visible: "no"},
            {field: "companyName", header: "CompanyName"}
        ],
        paginationOptions: {
            containerClass: "well pagination-container",
            visiblePageLinks: 5,
            showGoToPage: true,
            showRowsPerPage: true,
            showRowsInfo: true,
            showRowsDefaultInfo: true,
            disableTextSelectionInNavPane: true
        }

        //sorting: [
        //    {sortingName: "OrderLevel", field: "orderLevel", order: "none"},
        //    {sortingName: "OrderStatusId", field: "orderStatusId", order: "ascending"}
        //],
        //filterOptions: {
        //    filters: [
        //        //{
        //        //    filterName: "Lastname", "filterType": "text", field: "lastname", filterLabel: "Last name",
        //        //    excluded_operators: ["in", "not_in"],
        //        //    filter_interface: [
        //        //        {
        //        //            filter_element: "input",
        //        //            filter_element_attributes: {"type": "text"}
        //        //        }
        //        //    ]
        //        //},
        //        {
        //            filterName: "OrderStatusId", "filterType": "number", "numberType": "integer", field: "orderStatusId", filterLabel: "OrderStatusId",
        //            excluded_operators: ["equal", "not_equal", "less", "less_or_equal", "greater", "greater_or_equal"],
        //            filter_interface: [
        //                {
        //                    filter_element: "input",
        //                    filter_element_attributes: {type: "checkbox"}
        //                }
        //            ],
        //            lookup_values: [
        //                {lk_option: "making", lk_value: "1"},
        //                {lk_option: "finish", lk_value: "2", lk_selected: "yes"}
        //            ]
        //        },
        //        //{
        //        //    filterName: "DateUpdated", "filterType": "date", field: "date_updated", filterLabel: "Datetime updated",
        //        //    excluded_operators: ["in", "not_in"],
        //        //    filter_interface: [
        //        //        {
        //        //            filter_element: "input",
        //        //            filter_element_attributes: {
        //        //                type: "text",
        //        //                title: "Set the date and time using format: dd/mm/yyyy hh:mm:ss"
        //        //            },
        //        //            filter_widget: "datetimepicker",
        //        //            filter_widget_properties: {
        //        //                dateFormat: "dd/mm/yy",
        //        //                timeFormat: "HH:mm:ss",
        //        //                changeMonth: true,
        //        //                changeYear: true,
        //        //                showSecond: true
        //        //            }
        //        //        }
        //        //    ],
        //        //    validate_dateformat: ["DD/MM/YYYY HH:mm:ss"],
        //        //    filter_value_conversion: {
        //        //        function_name: "local_datetime_to_UTC_timestamp",
        //        //        args: [
        //        //            {"filter_value": "yes"},
        //        //            {"value": "DD/MM/YYYY HH:mm:ss"}
        //        //        ]
        //        //    }
        //        //}
        //    ]
        //}
    });
});

function sub(id){
    $('#id').val(id);
    getDownLoad();
    getDownLoadData();
    $('#myModal').modal('show');
}
function getDownLoad(){	
	$("#download").attr("href",  basePath+'toAllSearchDetail.do?companyId='+$('#companyid').text());
}

function getDownLoadData(){
    $.ajax({
        type: "POST",
        url: basePath+"ordersDownload.do",
        cache:false,
        data: "orderId="+$('#id').val(),
        dataType:"text",
        async:true,
        error: function(){
            alert("connect error");
        },
        success: function(result){
            var map = $.parseJSON(result);
            if(map.result){
                var resultObject = map.resultcontent;
                if(resultObject.orderStatus==1){
                    $("#downloadmsg").text("报告制作中...");
                    $("#downloadmsg").attr("href",  "#");
                }
                else if(resultObject.orderStatus==2){
                    $("#downloadmsg").text("下载最新报告");
                    $("#downloadmsg").attr("href",  basePath+resultObject.filename);
                }
            }
        }
    });
}

/**
 * Convert local timezone date string to UTC timestamp
 *
 * Alternative syntax using jquery (instead of moment.js):
 *     var date = $.datepicker.parseDateTime(dateformat, timeformat, date_str);
 *
 * @see http://stackoverflow.com/questions/948532/how-do-you-convert-a-javascript-date-to-utc
 * @param {String} date_str
 * @param {String} dateformat
 * @return {String}
 */
function local_datetime_to_UTC_timestamp(date_str, dateformat) {

    // avoid date overflow in user input (moment("14/14/2005", "DD/MM/YYYY") => Tue Feb 14 2006)
    if(moment(date_str, dateformat).isValid() == false) {
        throw new Error("Invalid date");
    }

    // parse date string using given dateformat and create a javascript date object
    var date = moment(date_str, dateformat).toDate();

    // use javascript getUTC* functions to conv ert to UTC
    return  date.getUTCFullYear() +
        PadDigits(date.getUTCMonth() + 1, 2) +
        PadDigits(date.getUTCDate(), 2) +
        PadDigits(date.getUTCHours(), 2) +
        PadDigits(date.getUTCMinutes(), 2) +
        PadDigits(date.getUTCSeconds(), 2);

}

/**
 * Add leading zeros
 * @param {Number} n
 * @param {Number} totalDigits
 * @return {String}
 */
function PadDigits(n, totalDigits) {
    n = n.toString();
    var pd = '';
    if(totalDigits > n.length) {
        for(i = 0; i < (totalDigits - n.length); i++) {
            pd += '0';
        }
    }
    return pd + n.toString();
}