package tk.mybatis.springboot.conf;

public interface Constants {

    String RETURN_CODE_TYPE_SUCCESS = "S";
    String RETURN_CODE_TYPE_FAILURE= "E";
    String RETURN_CODE_CODE_SUCCESS= "AAAAAA";
    String RETURN_REPLY_NAME = "result";
    /**
     * 返回状态
     */
    String RET_SUCCESS = "success";             // 成功
    String RET_FAILURE = "failure";             // 失败

    /**
     * 亿信业务申请表审批状态
     * 0 待提交审批 1 审批通过 2 审批拒绝 3 放弃  4 待修改 5.待企业审批
     * 6 待增信经办  7 待增信审核  8 待签收经办  9 待签收审核
     * 10 待平台经办 11 待平台审核
     */
    String APPRV_STATUS_UNSUBMIT = "0";
    String APPRV_STATUS_PASS = "1";
    String APPRV_STATUS_REJECT = "2";
    String APPRV_STATUS_DROP = "3";
    String APPRV_STATUS_MODIFY = "4";
    String APPRV_STATUS_WAIT_COMPANY_APPROVE = "5";
    String APPRV_STATUS_WAIT_SUPPORT_OPERATE = "6";
    String APPRV_STATUS_WAIT_SUPPORT_APPROVE = "7";
    String APPRV_STATUS_WAIT_RECEIVER_OPERATE = "8";
    String APPRV_STATUS_WAIT_RECEIVER_APPROVE = "9";
    String APPRV_STATUS_WAIT_PLATFORM_OPERATE = "10";
    String APPRV_STATUS_WAIT_PLATFORM_APPROVE = "11";

    /**
     * 业务类型
     */
    String BIZ_TYPE_MX_CREATE = "MXKL";             // 亿信开立
    String BIZ_TYPE_MX_TRANSFER = "MXLZ";           // 亿信流转
    String BIZ_TYPE_LOAN_APPLY = "RZSQ";              // 融资申请
    String BIZ_TYPE_DISTRIBUTE = "ZJFFK";              // 资金方放款
    String BIZ_TYPE_MXKL_STATUS = "MXKLJL";              // 亿信开立记录
    String BIZ_TYPE_MXLZ_STATUS = "MXLZJL";              // 亿信转让记录
    String BIZ_TYPE_MXRZ_STATUS = "MXRZJL";              // 亿信融资记录
    String BIZ_TYPE_RETURN_REMITTANCE = "RZTH";               // 融资退汇

    //客户信息注册申请
    String BIZ_TYPE_REGISTER = "REG";
    String REGISTER_OPER_TYPE_SUBMIT = "0";
    String REGISTER_OPER_TYPE_PLATFORM_A_APPROVED = "11";
    String REGISTER_OPER_TYPE_PLATFORM_B_APPROVED = "21";
    String REGISTER_OPER_TYPE_PLATFORM_A_REJECTED = "10";
    String REGISTER_OPER_TYPE_PLATFORM_B_REJECTED = "20";
    String BIZ_TYPE_CREATE_FUND = "CF";
    //客户信息修改申请
    String BIZ_TYPE_CUST_INFO_MODIFICATION = "CIM";
    String CIM_OPER_TYPE_SUBMIT = "0";
    String CIM_OPER_TYPE_REVIEWER_APPROVED = "11";
    String CIM_OPER_TYPE_PLATFORM_A_APPROVED = "21";
    String CIM_OPER_TYPE_PLATFORM_B_APPROVED = "31";
    String CIM_OPER_TYPE_REVIEWER_REJECTED = "10";
    String CIM_OPER_TYPE_PLATFORM_A_REJECTED = "20";
    String CIM_OPER_TYPE_PLATFORM_B_REJECTED = "30";
    String CIM_OPER_TYPE_DROP = "99";
    String WF_TEMPLATE_REGISTER = "registerProcess";
    String WF_TEMPLATE_CREATE_FUND = "createFundProcess";
    String WF_TEMPLATE_FELLOWSHIP_INFO_MODIFICATION = "fellowshipInfoModificationProcess";
    String WF_TEMPLATE_SUPPLIER_INFO_MODIFICATION = "supplierInfoModificationProcess";
    String WF_TEMPLATE_CI_INFO_MODIFICATION = "ciInfoModificationProcess";
    String WF_TEMPLATE_CORE_INFO_MODIFICATION = "coreInfoModificationProcess";
    String WF_TEMPLATE_CUST_INFO_MODIFICATION = "CustInfoModificationProcess";
    String BIZ_TYPE_SIGN = "SIGN";         //电子协议

    //用户信息管理
    String BIZ_TYPE_UIM = "UIM";
    String UIM_OPER_TYPE_PWD_RESET = "0";
    String UIM_OPER_TYPE_CREATE = "1";
    String UIM_OPER_TYPE_MODIFY = "2";

    String BIZ_TYPE_SUPPLIER_INFO = "SINF";

    String BIZ_TYPE_CJED = "CJED";  // 额度创建

    String BIZ_TYPE_FPED = "FPED";  // 额度分配

    String BIZ_TYPE_BGED = "BGED";  // 额度变更

    String BIZ_TYPE_TYED = "TYED";  // 额度停用

    String BIZ_TYPE_QYED = "QYED";  // 额度启用

    /**
     * 业务编号类型
     */
    // 亿信编号
    String BIZ_NO_MXNO = "MX";
    //客户编号
    String BIZ_NO_CUSTNO = "CUNO";
    //资金方编号
    String BIZ_NO_FUND_PROVIDER_NO = "FPNO";
    //注册申请编号
    String BIZ_NO_REGNO = "RGNO";
    //通知模版编号
    String BIZ_NO_NTNO = "RGNO";
    // 融资申请
    String BIZ_NO_LOAN_APPLY = "RZSQNO";
    // 账户请求流水号
    String BIZ_NO_ACCOUNT_REQUEST = "ACCT";
    // 合同编号
    String BIZ_NO_DOC = "DOC";
    // 合同编号
    String BIZ_NO_DOC_TMPL = "DOCTMPL";
    // 还款清分流水号
    String BIZ_NO_CLEARING_SEQNO = "HKQF";
    // 亿信支付流水号
    String BIZ_NO_MXPAY_SEQNO = "MXZF";
    // 额度申请
    String BIZ_NO_CREDITLIMIT_APP_NO = "CLNO";

    // 额度占用
    String BIZ_NO_CREDITLIMIT_OCUP_NO = "CLZY";

//    发票验真
    String BIZ_NO_INVOICE_VERIFY = "FPYZ";

    // 额度释放
    String BIZ_NO_CREDITLIMIT_RESTORE_NO = "CLSF";

    String SCFP_USER_STATUS_DISABLE = "0";
    String SCFP_USER_STATUS_ENABLE = "1";
    String SCFP_USER_STATUS_STEP_ONE = "2";
    String SCFP_USER_STATUS_STEP_TWO = "3";
    String SCFP_USER_STATUS_PENDING = "4";
    String SCFP_USER_STATUS_UKEY_BINDING = "5";
    String SCFP_USER_STATUS_6 = "6";
    String SCFP_USER_STATUS_7 = "7";
    String SCFP_USER_STATUS_REGISTER_REJECTED = "8";
    String SCFP_USER_STATUS_RESET_PWD = "99";

    String SCFP_USER_STATUS_TYPE_SYS = "SYS";
    String SCFP_USER_STATUS_TYPE_NON_SYS = "NON_SYS";

    String UKEY_STATUS_ENABLE = "1";
    String UKEY_STATUS_DISABLE = "0";

    String ROLE_CATEGORY_HANDLER = "5";
    String ROLE_CATEGORY_REVIEWER = "6";
    String ROLE_CATEGORY_ADMIN = "7";
//    注册完成赋予修改密码的角色
    String ROLE_CATEGORY_PEDNING_MODIFY_PASSWORD = "9";

    String CONTEXT_KEY_SCFP_USER = "SCFP_USER";
    String SESSION_USER = "SESSION_USER";
    String SMS_VERIFICATION_COUNT = "SMS_VERIFICATION_COUNT";

    String COMMON_YES = "1";        // 是
    String COMMON_NO = "0";         //否

    int COMMON_YES_INT = 1;        // 是
    int COMMON_NO_INT = 0;         //否

    String AOAR_ISSUE_MAPKEY = "aoar_issue";//开立方转让通知key
    String AOAR_TRANSFEROR_MAPKEY = "aoar_transferor";//转出人转让通知key

    String PLATFORM_GENERATE_FILE_NOTIFY_PREFIX="DZWJ";

    String PLATFORM_GENERATE_FILE_NOTIFY_FILE_TOKEN_PREFIX = "FILE_TOKEN";

    /**
     * @author zx-author
     * @Description  字典表数据类型
     * @Date 2018/12/13 10:51
     **/
    String DATA_TYPE_CUSTOMERACCOUNTTYPE = "CustomerAccountType";   // 客户账户类型
    String DATA_TYPE_PLATFORMACCOUNTTYPE = "PlatformAccountType";   // 平台账户类型


    /**
     * 业务文件表 文件类型
     */
    String  DOC_TYPE_CONTRACT="contract";  //电子协议


    /**
     * 文件上传用的临时业务编号前缀
     **/
    public static final String TEMP = "temp";

    /**
     * 返回给前端的json顶层名
     **/
    public static final String RESULT = "result";

    /**
     * 融资申请状态（融资审批表的审批状态）
     **/
    public static final String LOAN_APPLY_STATUS = "loanApplyStatus";
    /**
     * 放款状态（资金方审批表的审批状态）
     **/
    public static final String DISTRIBUTE_STATUS = "distributeStatus";

    /**
     *  亿信部分生命周期状态
     **/
    public static final String MX_LIFECYCLE_KL_STATUS = "mxLifeCycleKLStatus";
    public static final String MX_LIFECYCLE_LZ_STATUS = "mxLifeCycleLZStatus";
    public static final String MX_LIFECYCLE_RZ_STATUS = "mxLifeCycleRZStatus";

    /**
     * 资金方放款状态（资金方审批表的审批状态）
     **/
    public static final String LOAN_DISTRIBUTED_STATUS = "loanDistributedStatus";

//    角色名称
//    核心企业经办
    public static final String CORE_HANDLER = "R0000000000000003832";
    public static final String CORE_ADMIN = "R0000000000000003830";
    public static final String MEMBER_ADMIN = "R0000000000000010761";

    public static final String ROOT_MX = "ROOT";

    public static final String SYS_CODE = "Z21";//3位Domain
    public static final String BCP_AGENT_CODE = "2001701";  //业务ID

    //短信供应商类型
    //短信供应商类型-模拟
    public static final String SMS_VENDOR_MOCKING = "MOCKING";
    //短信供应商类型-电信
    public static final String SMS_VENDOR_189 = "189";
    //短信供应商类型-微服务
    public static final String SMS_VENDOR_SECURITY = "SECURITY";

    public static final String ADMIN_ROLE_INIT = "R0000000000000012224";

    // 默认系统用户
    String SYSTEM_USER = "system";

    /** 信件类型 */
    String MAIL_TYPE_INNERMAIL = "1";
    String MAIL_TYPE_EMAIL = "2";

    /** 消息通知类型 */
    String NOTICE_TYPE_TASKCREATED = "NOTICE001";   // 待办提醒
    String NOTICE_TYPE_MODIFICATION_APPROVED = "NOTICE002";   // 企业信息修改审批通过
    String NOTICE_TYPE_CORE_LIMIT_CREATED = "NOTICE003";   // 核心企业额度创建
    String NOTICE_TYPE_MEMBER_LIMIT_ALLOCATED = "NOTICE004";   // 成员企业额度分配
    String NOTICE_TYPE_CUST_LIMIT_DISABLED = "NOTICE005";   // 企业额度停用
    String NOTICE_TYPE_CUST_LIMIT_ENABLED = "NOTICE006";   // 企业额度启用
    String NOTICE_TYPE_MX_CREATE_SIGNED = "NOTICE007";   // 亿信开立签收
    String NOTICE_TYPE_MX_TRANSFER_SIGNED = "NOTICE008";   // 亿信流转签收
    String NOTICE_TYPE_LOAN_SIGNED = "NOTICE009";   // 融资签收（放款）
    String NOTICE_TYPE_CLEARING_FAILED = "NOTICE010";   // 清分失败
    String NOTICE_TYPE_CLEARING_SUCCESSFUL = "NOTICE011";   // 清分成功
    String NOTICE_TYPE_PAY_FAILED = "NOTICE012";   // 支付失败
    String NOTICE_TYPE_MX_ABOUT_TO_EXPIRE = "NOTICE013"; // 亿信即将到期
    String NOTICE_TYPE_MX_OVERDUE= "NOTICE014"; // 亿信预期

    String NOTICE_TYPE_REGISTER_APPROVED = "NOTICE023";
    String NOTICE_TYPE_ADMIN_CREATE_USER = "NOTICE024";
    String NOTICE_TYPE_ADMIN_DISABLE_USER = "NOTICE025";
    String NOTICE_TYPE_RESET_PWD = "NOTICE026";

    String NOTICE_TYPE_VERIFY_CODE = "NOTICE015";  // 发送验证码

    String NOTICE_TYPE_MX_CREATE_SUBMITTED = "NOTICE017";   // 亿信已提交
    String NOTICE_TYPE_MX_APPROVED = "NOTICE018";   // 亿信已审核
    String NOTICE_TYPE_MX_FIRSTSIGNED = "NOTICE019";   // 亿信已初审

    String NOTICE_TYPE_CUSTINFO_MODIFICATION_SUBMITTED = "NOTICE020";   // 企业信息修改已提交
    String NOTICE_TYPE_CUSTLIMIT_ALLOC_SUBMITTED = "NOTICE021";   // 成员企业额度分配已提交

    String NOTICE_TYPE_MODIFYPWD_VERIFY_CODE = "NOTICE022";  // 密码修改发送验证码

    String NOTICE_TYPE_PAY_SUCCESS = "NOTICE027";   // 支付成功


    /** 亿信到期提醒天数*/
    int MX_PAYMENT_REMIND_DAYS = 10;

    int PAGE_SIZE = 10;


    String NOTICE_TEMPLATE_TYPE_SMS = "1";
    String NOTICE_TEMPLATE_TYPE_INNERMAIL = "2";

    /** 消息通知名称 */
    String NOTICE_NAME_PENDINGTASKREMIND = "pendingTaskRemind";     // 待办任务
    String NOTICE_NAME_CLEARINGFAILED = "clearingFailed";        // 清分失败
    String NOTICE_NAME_CLEARINGSUCCESSFUL = "clearingSuccessful";   // 清分成功
    String NOTICE_NAME_CORELIMITCHANGE = "coreLimitChange";   // 核心企业额度变更
    String NOTICE_NAME_CUSTLIMITDISABLED_CORE = "custLimitDisabled_core";  // 核心企业客户额度停用
    String NOTICE_NAME_CUSTLIMITDISABLED_MEMBER = "custLimitDisabled_member";  // 成员企业客户额度停用
    String NOTICE_NAME_CUSTLIMITENABLED = "custLimitEnabled";   // 客户额度启用
    String NOTICE_NAME_CUSTOMERINFOMODIFIED = "customerInfoModified";   // 客户信息修改
    String NOTICE_NAME_LOANSIGNED_PREV = "loanSigned_prev";      // 融资签收-前手
    String NOTICE_NAME_LOANSIGNED_CORE = "loanSigned_core";      // 融资签收-核心
    String NOTICE_NAME_LOANSIGNED_APPLICANT = "loanSigned_applicant";      // 融资签收-申请人
    String NOTICE_NAME_MEMBERALLOCATED_CORE = "memberAllocated_core"; //成员企业额度分配-核心
    String NOTICE_NAME_MEMBERALLOCATED_MEMBER = "memberAllocated_member"; //成员企业额度分配-成员企业
    String NOTICE_NAME_MXABOUTTOEXPIRE = "mxAboutToExpire";     // 亿信到期提醒
    String NOTICE_NAME_MXCREATESIGNED = "mxCreateSigned";       // 亿信开立签收
    String NOTICE_NAME_MXOVERDUE_CORE = "mxOverdue_core";     // 亿信逾期提醒
    String NOTICE_NAME_MXOVERDUE_HOLDER = "mxOverdue_holder"; // 亿信到期未兑付
    String NOTICE_NAME_MXTRANSFERSIGNED_APPLICANT = "mxTransferSigned_applicant";   // 亿信流转签收-申请人
    String NOTICE_NAME_MXTRANSFERSIGNED_PREV = "mxTransferSigned_prev";   // 亿信流转签收-前手


    String NOTICE_NAME_VERIFY_CODE = "verifyCode";   // 验证码

    String NOTICE_NAME_MXCREATEWAITAUDITING = "mxCreateWaitAuditing";   // 亿信开立待审核
    String NOTICE_NAME_MXCREATEWAITSIGN = "mxCreateWaitSign";   // 亿信开立待签收
    String NOTICE_NAME_MXLOANWAITAUDITING = "mxLoanWaitAuditing";   // 亿信融资待审核

    String NOTICE_NAME_CUSTINFOMODIFICATIONWAITAUDITING = "custInfoModificationWaitAuditing"; // 企业信息修改待审核
    String NOTICE_NAME_CUSTLIMITALLOCWAITAUDITING = "custLimitAllocWaitAuditing";   // 成员企业额度分配待审核

    String NOTICE_NAME_PWDMODIFY = "pwdModify";  // 密码修改通知

    String NOTICE_NAME_REGISTER_APPROVED = "registerApproved";

    String NOTICE_NAME_ADMIN_DISABLE_USER = "adminDisableUser";

    String NOTICE_NAME_RESET_PWD = "resetPwd";

    /** 文件存储时FileKey的前缀*/
    String FILE_KEY_PREFIX = "FK";

    String NOTICE_NAME_ADMIN_CREATE_USER_REVIEWER = "adminCreateUserReviewer";
    String NOTICE_NAME_ADMIN_CREATE_USER_HANDLER = "adminCreateUserHandler";

    String NOTICE_NAME_PAYFAILED = "payFailed";        // 支付失败
    String NOTICE_NAME_PAYSUCCESSFUL = "paySuccessful";   // 支付成功

    String SYS_PARAM_TYPE = "system";

    String SYS_PARAM_NAME_FILESWITCH = "fileSwitch";

    String SYS_PARAM_NAME_CFCASWITCH = "cfcaSwitch";

    String SYS_PARAM_NAME_INVSWITCH = "invSwitch";

    String SYS_PARAM_NAME_UKEYBINDCHECKSWITCH = "ukeyBindCheckSwitch";

//    融资是否使用签章真实数据开关
    String SYS_PARAM_NAME_SIGNEDDOCSWITCH = "signedDocSwitch";

    String SYS_SYS_PARAM_NAME_ISOPENBLOCKCHAIN = "isOpenBlockChainService";

    String PWD_REGX = "PwdRegx";

    String USERNAME_REGX = "UsernameRegx";

    String SYS_PARAM_NAME_HASHCONFUSESWITCH = "hashConfuseSwitch";

    String SYS_PARAM_NAME_SMSSWITCH = "smsSwitch";

    String SYS_PARAM_NAME_QCCWITCH = "qccSwitch";
}
