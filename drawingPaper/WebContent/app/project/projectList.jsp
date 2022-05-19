
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="kr">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title></title>
    <link type="text/css" rel="stylesheet" href="../../assets/css/default.css" />
    <link type="text/css" rel="stylesheet" href="../../assets/css/project/projectList.css" />
    <link type="text/css" rel="stylesheet" href="../../assets/css/header.css" />
</head>

<body>
    <div class="wrap">
        <header id="header"></header>

		    <div class="style_DcWJD">
        <div class="style_kQkrtf">
            <div class="style_jxLqaO">
                <div class="style_dtkXPY"><img src="../../images/header/content.png" alt=""></div>
                <div class="style_bgpTeU">
                    <div class="style_cfcgIZ">프로젝트 올리기</div>
                    <div class="style_hwZyFc">
                        <div class="style_kuGxgw">
                            <img src="../../images/header/content.png" alt="" class="style_hart">
                        </div>
                    </div>
                    <div class="style_hwZyFc">
                        <div class="style_kuGxgw">
                            <img src="../../images/header/content.png" alt="" class="style_bell">
                        </div>
                    </div>
                    <div class="style_UserButtonWrapper">
                        <div class="style_UserButton">
                            <div style="margin:0;padding:0" class="style_UserAvatar"><span style="margin:0;padding:0"
                                    class="ProfileImg_StyledProfileImg"><span class="username">백</span></span></div>
                            <div class="style__UserText">백엔드</div>
                        </div>
                        <div class="SNB_Wrapper">
                            <div class="SNB_MenuList">
                                <div class="SNB_MenuItem">프로필</div>
                                <div class="SNB_MenuItem">응원권</div>
                                <div class="SNB_MenuItemDivider"></div>
                                <div class="SNB_MenuItem">후원현황</div>
                                <div class="SNB_MenuItem">관심 프로젝트</div>
                                <div class="SNB_MenuItem">팔로우</div>
                                <div class="SNB_MenuItemDivider"></div>
                                <div class="SNB_MenuItem">알림</div>
                                <div class="SNB_MenuItem">메시지</div>
                                <div class="SNB_BannerWrapperF">
                                    <div class="SNB_KakaoBanner"><span>플친 추가하고 <br>프로젝트 추천받기</span>
                                        <div class="SNB_KakaoIconWrapper">
                                            <img src="../../images/header/content.png" alt="">
                                        </div>
                                    </div>
                                </div>
                                <div class="SNB_MenuItemDivider"></div>
                                <div class="SNB_MenuItem">내가 만든 프로젝트</div>
                                <div class="SNB_MenuItem">설정</div>
                                <div class="SNB_MenuItemDivider"></div>
                                <div class="SNB_MenuItem">로그아웃</div>
                            </div>
                            <div class="SNB_DimmedLayer"></div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="style_HeaderContentLayout">
                <div class="style_SearchBar">
                    <div class="style_CategorySection">
                        <div style="padding:0" class="style_CategoryWrapper_ca">
                            <div style="margin:0 8px 0 0" class="style_kuGxgw">
                                <img src="../../images/header/content.png" alt="" width="10" class="style_MenuIcon">
                            </div>카테고리
                        </div>
                        <div class="style_CategoryWrapper_home">홈</div>
                        <div class="style_CategoryWrapper">인기</div>
                        <div class="style_CategoryWrapper">신규</div>
                        <div class="style_CategoryWrapper">마감임박</div>
                    </div>
                    <div class="style_SearchInputWrapper"><input placeholder="검색어를 입력해주세요." class="style_SearchInput">
                        <div class="style_SearchButton">
                            <img src="../../images/header/content.png" alt="" class="style_SearchIcon">
                        </div>
                    </div>
                </div>
                <div class="style_ExtendedCategorySection">
                    <div class="style_ExtendedCategorySectionMHeader">
                        <img src="../../images/header/content.png" alt="">
                    </div>카테고리</div>
                <div class="style_CategoryContainer">
                    <div class="style_Depth1CategoryWrapper">
                        <div class="style_Depth1CategoryGroup">
                            <div class="style_Depth1Category_cNAPbs">
                                <div class="style_Depth1CategoryIcon">
                                    <img src="../../images/header/content.png" alt="">
                                </div>
                                <div class="style_Depth1CategoryTextall">전체</div>
                            </div>
                            <div class="style_Depth1Category">
                                <div class="style_Depth1CategoryIcon"><img src="../../images/header/content.png"
                                        class="style_Depth1CategoryIconImage"></div>
                                <div class="style_Depth1CategoryText">예술</div>
                            </div>
                            <div class="style_Depth1Category">
                                <div class="style_Depth1CategoryIcon"><img src="../../images/header/content.png"
                                        class="style_Depth1CategoryIconImage"></div>
                                <div class="style_Depth1CategoryText">음악</div>
                            </div>
                            <div class="style_Depth1Category">
                                <div class="style_Depth1CategoryIcon"><img src="../../images/header/content.png"
                                        class="style_Depth1CategoryIconImage"></div>
                                <div class="style_Depth1CategoryText">영화 · 비디오</div>
                            </div>
                            <div class="style_Depth1Category">
                                <div class="style_Depth1CategoryIcon"><img src="../../images/header/content.png"
                                        class="style_Depth1CategoryIconImagem"></div>
                                <div class="style_Depth1CategoryText">공연</div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

        <main>
            <section>
                <div class="selectCell">
                    <div class="quickFilger">
                        <div>
                            <div class="filterBtn">달성률<span></span></div>
                            <div class="fliterList left">
                                <div>전체보기</div>
                                <div>75%이하</div>
                                <div>75%~100%</div>
                                <div>100%이상</div>
                            </div>
                        </div>
                        <div class="filter">
                            <div class="filterBtn" id="boxBtn2">최신순<span></span></div>
                            <div class="fliterList right">
                                <div>인기순</div>
                                <div>최신순</div>
                                <div>최다 후원순</div>
                                <div>최다 금액순</div>
                                <div>마감 임박순</div>
                            </div>
                        </div>
                    </div>


                    <div class="totalProject">
                        <span class="ft_Color2">526</span>개의 프로젝트가 있습니다.
                    </div>
                </div>
                <!-- 이미지 리스트 -->
                <div class="itmeList">
                    <figure>
                        <div class="itmeCell">
                            <div class="imgCell">
                                <a href="">
                                    <img src="../../images/project/bg/indi01.webp" alt="">
                                </a>
                                <a class="heartcon on">
                                    <!-- <img class="icon" src="/assets/image/icon/icons-heart-white.png" alt=""> -->
                                </a>
                            </div>
                            <div class="textBox">
                                <a href="">홈,리빙 | 트로스트</a>
                                <a href="">실컷 울고 난 뒤 느끼는 후련함의 향 - 감정 부스팅 오일</a>
                                <a href="">비와 슬픔, 봄과 사랑은 같은 향일까? 내 감정을 만나는 100% 천연 오일 드롭퍼</a>
                            </div>
                            <div class="dadaBox">
                                <div class="data1">
                                    <span>45%</span>
                                    <span>2,288,000원</span>
                                </div>
                                <div class="data2">
                                    <span>13일 남음</span>
                                </div>
                            </div>
                            <div class="bar"><div style="width:45%"></div></div>
                        </div>
                    </figure>

                    <figure>
                        <div class="itmeCell">
                            <div class="imgCell">
                                <a href="">
                                    <img src="../../images/project/bg/indi02.webp" alt="">
                                </a>
                                <a class="heartcon">
                                    <!-- <img class="icon" src="/assets/image/icon/icons-heart-white.png" alt=""> -->
                                </a>
                            </div>
                            <div class="textBox">
                                <a href="">홈,리빙 | 트로스트</a>
                                <a href="">실컷 울고 난 뒤 느끼는 후련함의 향 - 감정 부스팅 오일</a>
                                <a href="">비와 슬픔, 봄과 사랑은 같은 향일까? 내 감정을 만나는 100% 천연 오일 드롭퍼</a>
                            </div>
                            <div class="dadaBox">
                                <div class="data1">
                                    <span>10%</span>
                                    <span>2,288,000원</span>
                                </div>
                                <div class="data2">
                                    <span>13일 남음</span>
                                </div>
                            </div>
                            <div class="bar"><div style="width:10%"></div></div>
                        </div>
                    </figure>
                    
                    <figure>
                        <div class="itmeCell">
                            <div class="imgCell">
                                <a href="">
                                    <img src="../../images/project/bg/indi03.webp" alt="">
                                </a>
                                <a class="heartcon">
                                    <!-- <img class="icon" src="/assets/image/icon/icons-heart-white.png" alt=""> -->
                                </a>
                            </div>
                            <div class="textBox">
                                <a href="">홈,리빙 | 트로스트</a>
                                <a href="">실컷 울고 난 뒤 느끼는 후련함의 향 - 감정 부스팅 오일</a>
                                <a href="">비와 슬픔, 봄과 사랑은 같은 향일까? 내 감정을 만나는 100% 천연 오일 드롭퍼</a>
                            </div>
                            <div class="dadaBox">
                                <div class="data1">
                                    <span>30%</span>
                                    <span>2,288,000원</span>
                                </div>
                                <div class="data2">
                                    <span>13일 남음</span>
                                </div>
                            </div>
                            <div class="bar"><div style="width:30%"></div></div>
                        </div>
                    </figure>
                    
                    <figure>
                        <div class="itmeCell">
                            <div class="imgCell">
                                <a href="">
                                    <img src="../../images/project/bg/indi04.webp" alt="">
                                </a>
                                <a class="heartcon">
                                    <!-- <img class="icon" src="/assets/image/icon/icons-heart-white.png" alt=""> -->
                                </a>
                            </div>
                            <div class="textBox">
                                <a href="">홈,리빙 | 트로스트</a>
                                <a href="">실컷 울고 난 뒤 느끼는 후련함의 향 - 감정 부스팅 오일</a>
                                <a href="">비와 슬픔, 봄과 사랑은 같은 향일까? 내 감정을 만나는 100% 천연 오일 드롭퍼</a>
                            </div>
                            <div class="dadaBox">
                                <div class="data1">
                                    <span>44%</span>
                                    <span>2,288,000원</span>
                                </div>
                                <div class="data2">
                                    <span>13일 남음</span>
                                </div>
                            </div>
                            <div class="bar"><div style="width:44%"></div></div>
                        </div>
                    </figure>
                    
                    <figure>
                        <div class="itmeCell">
                            <div class="imgCell">
                                <a href="">
                                    <img src="../../images/project/bg/indi05.webp" alt="">
                                </a>
                                <a class="heartcon">
                                    <!-- <img class="icon" src="/assets/image/icon/icons-heart-white.png" alt=""> -->
                                </a>
                            </div>
                            <div class="textBox">
                                <a href="">홈,리빙 | 트로스트</a>
                                <a href="">실컷 울고 난 뒤 느끼는 후련함의 향 - 감정 부스팅 오일</a>
                                <a href="">비와 슬픔, 봄과 사랑은 같은 향일까? 내 감정을 만나는 100% 천연 오일 드롭퍼</a>
                            </div>
                            <div class="dadaBox">
                                <div class="data1">
                                    <span>1000%</span>
                                    <span>2,288,000원</span>
                                </div>
                                <div class="data2">
                                    <span>13일 남음</span>
                                </div>
                            </div>
                            <div class="bar"><div style="width:1000%"></div></div>
                        </div>
                    </figure>
                    
                    <figure>
                        <div class="itmeCell">
                            <div class="imgCell">
                                <a href="">
                                    <img src="../../images/project/bg/indi06.webp" alt="">
                                </a>
                                <a class="heartcon">
                                    <!-- <img class="icon" src="/assets/image/icon/icons-heart-white.png" alt=""> -->
                                </a>
                            </div>
                            <div class="textBox">
                                <a href="">홈,리빙 | 트로스트</a>
                                <a href="">실컷 울고 난 뒤 느끼는 후련함의 향 - 감정 부스팅 오일</a>
                                <a href="">비와 슬픔, 봄과 사랑은 같은 향일까? 내 감정을 만나는 100% 천연 오일 드롭퍼</a>
                            </div>
                            <div class="dadaBox">
                                <div class="data1">
                                    <span>200%</span>
                                    <span>2,288,000원</span>
                                </div>
                                <div class="data2">
                                    <span>13일 남음</span>
                                </div>
                            </div>
                            <div class="bar"><div style="width:200%"></div></div>
                        </div>
                    </figure>
                    
                    <figure>
                        <div class="itmeCell">
                            <div class="imgCell">
                                <a href="">
                                    <img src="../../images/project/bg/indi01.webp" alt="">
                                </a>
                                <a class="heartcon">
                                    <!-- <img class="icon" src="/assets/image/icon/icons-heart-white.png" alt=""> -->
                                </a>
                            </div>
                            <div class="textBox">
                                <a href="">홈,리빙 | 트로스트</a>
                                <a href="">실컷 울고 난 뒤 느끼는 후련함의 향 - 감정 부스팅 오일</a>
                                <a href="">비와 슬픔, 봄과 사랑은 같은 향일까? 내 감정을 만나는 100% 천연 오일 드롭퍼</a>
                            </div>
                            <div class="dadaBox">
                                <div class="data1">
                                    <span>22%</span>
                                    <span>2,288,000원</span>
                                </div>
                                <div class="data2">
                                    <span>13일 남음</span>
                                </div>
                            </div>
                            <div class="bar"><div style="width:22%"></div></div>
                        </div>
                    </figure>
                    
                    <figure>
                        <div class="itmeCell">
                            <div class="imgCell">
                                <a href="">
                                    <img src="../../images/project/bg/indi02.webp" alt="">
                                </a>
                                <a class="heartcon">
                                    <!-- <img class="icon" src="/assets/image/icon/icons-heart-white.png" alt=""> -->
                                </a>
                            </div>
                            <div class="textBox">
                                <a href="">홈,리빙 | 트로스트</a>
                                <a href="">실컷 울고 난 뒤 느끼는 후련함의 향 - 감정 부스팅 오일</a>
                                <a href="">비와 슬픔, 봄과 사랑은 같은 향일까? 내 감정을 만나는 100% 천연 오일 드롭퍼</a>
                            </div>
                            <div class="dadaBox">
                                <div class="data1">
                                    <span>80%</span>
                                    <span>2,288,000원</span>
                                </div>
                                <div class="data2">
                                    <span>13일 남음</span>
                                </div>
                            </div>
                            <div class="bar"><div style="width:80%"></div></div>
                        </div>
                    </figure>

                </div>

            </section>
        </main>

        <footer id="footer"></footer>

    </div>

    <script type="text/javascript" src="../../assets/js/jquery-3.6.0.min.js"></script>
    <script type="text/javascript" src="../../assets/js/default.js"></script>    
    <script type="text/javascript" src="../../assets/js/project/projects.js"></script>
    <script type="text/javascript" src="../../assets/js/header.js"></script>
</body>

</html>