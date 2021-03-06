   <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<lang lang="ko-KR"></lang>

<head>
    <meta charset="utf-8">
    <title data-react-helmet="true">펀딩</title>
    <script type="text/javascript" src="../../assets/js/jquery-3.6.0.min.js"></script>
    <script type="text/javascript" src="../../assets/js/join/deleteCheck.js"></script>
    
</head>

<body>
    <div id="headers"></div>
    <link rel="stylesheet" href="../../assets/css/join/deleteCheck.css">
    <link rel="stylesheet" href="../../assets/css/header.css">
    
    <section>
        <div id="react-view" class="tbb-only-ff">
            <div class="style_DcWJD"></div>
            <div class="style_gmYOwM">
                <div class="style_JLshK tbb">
                    <div class="style_dZTvTb tbb">
                        <div class="style_dwSooV">
                            <div class="margin Container_RImG">
                                <span class="style_fnt-lt">
                                   	 회원 탈퇴
                                </span>
                            </div>
                        </div>
                        <div class="margin Container_cBxsmA">
                            <div class="margin style_itbMaK">
                                <div class="style_Ctitle">서비스 이용에 <br /> 불편함이 있으신가요?</div>
                                <div class="style_bluckCon">
                                    <div class="style_content">알림을 너무 많이 수신하고 계신가요?
                                        <a href="" target="_blank" rel="noreferrer">알림 설정</a>에서 수신을 거부할 수 있습니다.
                                    </div>
                                    <div class="style_content">기타 불편한 사항이 있다면 언제든 텀블벅에 알려주세요.
                                        <a href="" target="_blank" rel="noreferrer">문의하기</a>
                                    </div>
                                </div>
                            </div>
                            <div class="margin style_itbMaK">
                                <div class="style_Ctitle">탈퇴 전, 유의사항을 <br /> 확인해주시기 바랍니다.</div>
                                <div class="style_bluckCon">
                                    <div class="style_lixiAB">
                                        <div class="style_content_title">계정 및 알림</div>
                                        <div class="style_content">계정이 카카오, 페이스북, 네이버, 애플 계정과 연동돼 있었다면 연동이 모두 해제됩니다.
                                        </div>
                                        <div class="style_content"><strong><!-- 백엔드 --></strong> 계정으로 수신하던 모든
			                                            알림(이메일, 카카오 알림톡, 앱 푸시)가 해제됩니다. 뉴스레터 구독은 이메일 하단 Unsubscribe 버튼을 눌러 취소할 수
			                                            있습니다.</div>
                                    </div>
                                    <div class="style_lixiAB">
                                        <div class="style_content_title">후원 및 결제</div>
                                        <div class="style_content"><strong>이미 결제된 후원은 취소되지
                                                않습니다.</strong></div>
                                        <div class="style_content">결제 완료 후 탈퇴하더라도, 선물 전달이 완료될 때까지 창작자가 배송정보를 열람할 수
                                            있습니다.</div>
                                        <div class="style_content"><strong>아직 선물을 받지 못했다면, 선물 전달 과정에서
                                                불이익이 발생할 수 있습니다.</strong>
                                            배송정보를 변경할 수 없으며 전달에 관한 커뮤니티 공지, 메시지 등을 확인할 수 없습니다.</div>
                                        <div class="style_content">관련 법령에 따라 후원 및 후원취소에 관한 기록, 결제 및 선물 전달에 관한 기록은 5년 동안
                                            보관됩니다.</div>
                                    </div>
                                        <div class="style_lixiAB">
                                            <div class="style_content_title">프로젝트</div>
                                            <div class="style_content">작성중, 제출, 반려 및 승인된 프로젝트는 모두 삭제되고 공개예정, 펀딩 진행중인
                                                프로젝트는
                                                모두 중단됩니다.</div>
                                            <div class="style_content"><strong>펀딩이 종료된 프로젝트는 삭제되지
                                                    않습니다.</strong></div>
                                            <div class="style_content">탈퇴하더라도, 이미 펀딩이 종료된 프로젝트에 관한
                                                <strong>창작자의 의무와 책임 조항은 그 효력을 유지합니다.</strong>
                                            </div>
                                        </div>
                                        <form action="deleteUser.jsp">
                                            <div class="style_boxs">
                                                <div class="style_boxs_check">
                                                    <label class="Checkbox_fcsWyW">
                                                        <inpuT type="checkbox" id='my_checkbox' required 
                                                        oninvalid="this.setCustomValidity('탈퇴 유의사항을 확인해주세요.')"
                                                        oninput = "this.setCustomValidity('')">탈퇴 유의사항을 확인했습니다.</label>
                                                </div>
                                                   <button class="style_button" color="gray80"><span>다음</span></button>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                </div>
            </div>
        </div>
    </section>

    <footer>
        <div class="style_ewzIHP">
            <div class="style_iFzqvD">텀블벅은 플랫폼 제공자로서 프로젝트의 당사자가 아니며, 직접적인
                통신판매를 진행하지
                않습니다.
                프로젝트의 완수 및 선물제공의 책임은 해당 프로젝트의 창작자에게 있으며, 프로젝트와 관련하여 후원자와 발생하는 법적 분쟁에 대한 책임은 해당 창작자가 부담합니다.
            </div>
        </div>
    </footer>
</body>

</html>
