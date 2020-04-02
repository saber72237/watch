var myChart = echarts.init(document.getElementById('chart'));
var min = 95;
var max = 99;
var myDate = new Date();
var myDate1 = new Date();
myDate1.setUTCMinutes(1);
var myDate2 = new Date();
myDate2.setUTCMinutes(2);
var myDate3 = new Date();
myDate3.setUTCMinutes(3);
var myDate4 = new Date();
myDate4.setUTCMinutes(4);
var myDate5 = new Date();
myDate5.setUTCMinutes(5);
var myDate6 =new Date();
myDate6.setUTCMinutes(6);
var myDate7 = new Date();
myDate7.setUTCMinutes(7);
var myDate8 = new Date();
myDate8.setUTCMinutes(8);
var myDate9 = new Date();
myDate9.setUTCMinutes(9);
var myDate10 = new Date();
myDate10.setUTCMinutes(10);
var myDate11 = new Date();
myDate11.setUTCMinutes(11);
var myDate12 = new Date();
myDate12.setUTCMinutes(12);
var myDate13 = new Date();
myDate13.setUTCMinutes(13);
var myDate14 = new Date();
myDate14.setUTCMinutes(14);
var myDate15 = new Date();
myDate15.setUTCMinutes(15);
var myDate16 = new Date();
myDate16.setUTCMinutes(16);
var myDate17 = new Date();
myDate17.setUTCMinutes(17);
var myDate18 = new Date();
myDate18.setUTCMinutes(18);
var myDate19 = new Date();
myDate19.setUTCMinutes(19);
var myDate20 = new Date();
myDate20.setUTCMinutes(20);
var myDate21 = new Date();
myDate21.setUTCMinutes(21);
var myDate22 = new Date();
myDate22.setUTCMinutes(22);
var myDate23 = new Date();
myDate23.setUTCMinutes(23);

var random = parseInt(Math.random()*(max-min)*10+min,10);
var random1 = parseInt(Math.random()*(max-min)*10+min,10);
var random2 = parseInt(Math.random()*(max-min)*10+min,10);
var random3 = parseInt(Math.random()*(max-min)*10+min,10);
var random4 = parseInt(Math.random()*(max-min)*10+min,10);
var random5 = parseInt(Math.random()*(max-min)*10+min,10);
var random6 = parseInt(Math.random()*(max-min)*10+min,10);
var random7 = parseInt(Math.random()*(max-min)*10+min,10);
var random8 = parseInt(Math.random()*(max-min)*10+min,10);
var category = new Array(myDate1, myDate2, myDate3, myDate4,
    myDate5, myDate6, myDate7, myDate8,
    myDate9, myDate10, myDate,myDate11, myDate12,
    myDate13, myDate14, myDate15, myDate16,
    myDate17, myDate18, myDate19, myDate20,
    myDate21, myDate22, myDate23)
var heart = new Array(98,95,95,98,98,98,98,97,96,98,98,99,95,98,98,95,98,98,97,98,98,99,98,95)
option = {
    legend :{
        data: ['%']
    },
    xAxis: {
        type: 'category',
        data: category
    },
    yAxis: {
        type: 'value',
        // scale: true
        // min: function (value) {
        //     return value.min - 20;
        // },
        // max: function (value) {
        //     return value.max +20;
        // }
    },
    series: [{
        name: '%',
        data: heart,
        type: 'line',
        smooth: false,
        markPoint: {
            data: [
                {type: 'max', name: '最大值'},
                {type: 'min', name: '最小值'}
            ]
        },
        markLine: {
            data: [
                {yAxis: 99, name: '99', itemStyle: {
                        normal: {
                            color: 'orange'
                        }
                    }},
                {yAxis: 95, name: '95', itemStyle: {
                        normal: {
                            color: 'orange'
                        }
                    }}
            ]
        }
    }],
    tooltip: {
        show: true,
        trigger: 'axis'
    },
    dataZoom: {
        tpye: 'silider',
        startValue: category[category.length - 20]
    },
    toolbox: {
        feature: {
            dataZoom: {
                show: true,
                xAxisIndex: 0,
                orient: 'horizontal'
            },
            restore: {
                show: true,
                title: '还原'
            }
        }
    }
};
myChart.setOption(option);
window.onresize = myChart.resize;
