package quiz;

public class A01_printQuiz {

	public static void main(String[] args) {
		// sysout 적은 뒤 Ctrl + Space : 자동완성
//1번		
		System.out.println("\t\t=====================");
		System.out.println("\t\t\t /)/)");
		System.out.println("\t\t\t(  ..)");
		System.out.println("\t\t\t(   >♡");
		System.out.println("\t\t  Have a Good Time.");
		System.out.println("\t\t=====================");
		
		//비어있는 sysout은 한줄 공백을 생성한다.
		System.out.println();
		
//2번		
		System.out.println("\t\t\t\t    ####회비 정보####");
		System.out.println("\t\t=====================================================");
		System.out.println("\t\t이름\t\t나이\t전화번호\t\t 회비");
		System.out.println("\t\t=====================================================");
		System.out.println("\t\t홍길동\t\t\"15\"\t010-123-1234\t  ￦20,000");
		System.out.println("\t\t임꺽정\t\t\"20\"\t010-234-2345\t  ￦30,000");
		System.out.println("\t\t김말이\t\t\"28\"\t010-345-3456\t  ￦50,000");
		System.out.println("\t\t-----------------------------------------------------");
		System.out.println("\t\t총합계\t\t\t\t\t  ￦100,000");
		System.out.println("\t\t=====================================================");
		
		// ctrl + /로 범위 주석처리		
//		System.out.println("                                                                                       \n"
//				+ "                                                                                                    \r\n"
//				+ "                                                                                                    \r\n"
//				+ "                                  =.                                                                \r\n"
//				+ "                                 ;.:                                                                \r\n"
//				+ "                                ,, ,;                                                               \r\n"
//				+ "                               .!   -.                                                              \r\n"
//				+ "                              .;     :.                                                             \r\n"
//				+ "                              ~.      ;                                                             \r\n"
//				+ "                             -~       ,-                                                            \r\n"
//				+ "                            .:         ~-                                                           \r\n"
//				+ "                            !           -                                                           \r\n"
//				+ "                           ,,           ,;                                                          \r\n"
//				+ "                           *             .:                                                         \r\n"
//				+ "                          ;               ~.                                                        \r\n"
//				+ "                         ~,               .*                                                        \r\n"
//				+ "                         -                 .~                                                       \r\n"
//				+ "                        !.                  ~,                                                      \r\n"
//				+ "                       .,                    ;                                                      \r\n"
//				+ "                       :                     .:                                                     \r\n"
//				+ "                      ,-                      ,:                                                    \r\n"
//				+ "                      !                        -                                                    \r\n"
//				+ "                     !.                        .*                                                   \r\n"
//				+ "                    .,                           ;                                                  \r\n"
//				+ "                    ~.                         ,~.                                                  \r\n"
//				+ "                    :                          ~                                                    \r\n"
//				+ "                   *                         ,;                                                     \r\n"
//				+ "                  ~,                        .:                                                      \r\n"
//				+ "                  ~                        .;                                                       \r\n"
//				+ "                 .-                       ,~                                                        \r\n"
//				+ "                 *                        :                                                         \r\n"
//				+ "                ,~                       :                                                          \r\n"
//				+ "                !                       -.                                                          \r\n"
//				+ "               -,                      -,                                                           \r\n"
//				+ "               -.                     ;,                                                            \r\n"
//				+ "               !                     ~,                                                             \r\n"
//				+ "              :                     :~                                                              \r\n"
//				+ "              !                    :,                                                               \r\n"
//				+ "             ~                     ,                                                                \r\n"
//				+ "             -                    =!,                                                               \r\n"
//				+ "            .:                       ,*#!  ..                                                       \r\n"
//				+ "            -.                            -;:,.:;-                                                  \r\n"
//				+ "            $                                  ..~-                                                 \r\n"
//				+ "           .-                                    -                                                  \r\n"
//				+ "           !                                    ~,                                                  \r\n"
//				+ "           -                                    !                                                   \r\n"
//				+ "          ,,                          ,~,      -,-~;;;:-..,;                                        \r\n"
//				+ "          -,                  ~!$##*-. ,~      ..:~        ,                                        \r\n"
//				+ "          -   .,~~~-..-:!!;~.          -        ;~.       =                                         \r\n"
//				+ "          $!-...,,,.                   *       -=.       ,$=;,!                                     \r\n"
//				+ "                                      ,         ;;.~:         ,                                     \r\n"
//				+ "                                      !        :~--.,        .,                                     \r\n"
//				+ "                                     .      .=~    #         =                                      \r\n"
//				+ "                                     -, .:-;,      ~,~;;:;  ~.                                      \r\n"
//				+ "                                     ~~=,.           .---.  -                                       \r\n"
//				+ "                                     !.       .,.;*:,.   ,~*!,,,                                    \r\n"
//				+ "          ,*~                               ,:,-.             --~;                                  \r\n"
//				+ "          ~@@!.                           ,$.                     ~*                                \r\n"
//				+ "          -@@@$-                        -,-                         ~~:                             \r\n"
//				+ "          -@@@@#~                      :-                             .;,                           \r\n"
//				+ "          .=@@@@@!.                  .;.                                :-.                         \r\n"
//				+ "           *@@@@@@=                  ;                                   .;.                        \r\n"
//				+ "           ,@@@@@@#$.              .*       .,!=!~,..,~*$;..               ;,                       \r\n"
//				+ "            #@@@@@! :,            .:     ,:-~.            .~,~-             ,-                      \r\n"
//				+ "            ,@@@@@~  ;,           $    .=                     .#,            ,:                     \r\n"
//				+ "            .$@@@$.   --         :   ,~~                        ---           ,,                    \r\n"
//				+ "             ;@@@$     -~       --  !-                            -:           ;                 ,;,\r\n"
//				+ "             ,#@@=      ,~      :  -  .,..~*=*:~---~;*=*-.,,        =.          =            .,!@@@;\r\n"
//				+ "              *@@:       ,~    :,  ,..,~-.               .-~.::      ~,         .~         .!=#@@@@,\r\n"
//				+ "               @@.        --   *                               ~*.    ;,         ,        :@#@@@@@=.\r\n"
//				+ "               ;@          -, ~                                  -:~   ~.        -.     ~:.#@@@@@@; \r\n"
//				+ "               ,$           ~.-                                    .::  ,         ~   ~~. .@@@@@@@  \r\n"
//				+ "                !            ;-                                      ,!,,         = ,~-   .@@@@@#-  \r\n"
//				+ "                .!            :               .,,,.                               ~;~     .@@@@@!   \r\n"
//				+ "                 ,,            $       . ,*$!-    .-;=$:..                       .=       .@@@@#,   \r\n"
//				+ "                 .:             :   .:,:~               .:-~-                   ;-        .@@@@:    \r\n"
//				+ "                  -.            .,.*..                       !~                ;.         .@#@;     \r\n"
//				+ "                   *.            :*        .....              .*-            -:           ~#@=.     \r\n"
//				+ "                    ~             ~,,;*!~,.......,:**:.         ,:~         -~            $@@,      \r\n"
//				+ "                    ~-            .:        .....     .!$~..      ,~.      ,~             @#.       \r\n"
//				+ "                     :             -, -;:,.,-~~--..-;;,   -~,;,    .~-    --             ~#~        \r\n"
//				+ "                      =            .#:                 :#~    .$:    ;.  !.              *:         \r\n"
//				+ "                      .~          ,,                      ;~-,  .;-~  =.:               ,:          \r\n"
//				+ "                       -.                                   ,,!    ,,;,;.              .:           \r\n"
//				+ "                        !.                                     ;:.    ;               .!            \r\n"
//				+ "                         ;.    .                                .,:  -.              -- ~           \r\n"
//				+ "                          $   .                                   ,;.~              :,  *           \r\n"
//				+ "                           ;,-                                     -;              :,   ;           \r\n"
//				+ "                            !.                                     .              !.    ,           \r\n"
//				+ "                           ,,                                      .            -!,     ..          \r\n"
//				+ "                           :                                                   :~ :     ,,          \r\n"
//				+ "                           ;                                                 .*.  * -  ,--          \r\n"
//				+ "                          ;                                                 :;    .~.  =--          \r\n"
//				+ "                          *                                                $;      ! * :--          \r\n"
//				+ "                         ..                                             .~~,-      .,* .--          \r\n"
//				+ "                         :.                                            ~-, =        ~.~ !           \r\n"
//				+ "                         ~.                                          .!,, -.        :,;.            \r\n"
//				+ "                         .                                             .. ~          ::-            \r\n"
//				+ "                         :                                              ..~                         \r\n"
//				+ "                         :                                              ,.-                         \r\n"
//				+ "                        ~      ;===~                                    ~;                          \r\n"
//				+ "                  .,..!$$     !@@=.#,                                   :=                          \r\n"
//				+ "               -!~,~-  .-    ,@@$. ;@-                                  !.                          \r\n"
//				+ "            -#:        !     #@@$, !#!                                  *                           \r\n"
//				+ "    ~,  :.~:           -     @@@@!:$@!                                  *                           \r\n"
//				+ "    :-$ .             ,~     #@@@@@@@!                                  !                           \r\n"
//				+ " .-.~                 -.     -@@@@@@@-                   -              *=; -,                      \r\n"
//				+ " ;~.-                 *       *@@@@#~                  :~-              :   -,-!.                   \r\n"
//				+ " :                   .~~.      =###~                  ~-.;@@@$.         ~        =; .               \r\n"
//				+ ".:                   *  ;-                            ,;#!;~:;$:        .          -~,:             \r\n"
//				+ ",~                   :   ,                 ..         ~!.      @-       .             .-=,          \r\n"
//				+ " ~                  .    :.                ~*,                         ,,                -*,,-.~    \r\n"
//				+ " !                  ~,   .                                             --                   .,.*    \r\n"
//				+ ",~                  ~,                                                 --                      =    \r\n"
//				+ ".-~                 -.           ~                                     ..                      ,:   \r\n"
//				+ " ..                  ,   -.       ;,    .$$~*-                         :                       !    \r\n"
//				+ " .-;---              *   ~.        ~~-*;.    ,;-             ~;..;~.   !                       .~   \r\n"
//				+ "     .,,*~           .: ,-          ~ !        .,!.   ~     :.     !  .,                       :-   \r\n"
//				+ "          :*.,,       !=,           #,.           ~$=-     ~.       : =                        :    \r\n"
//				+ "             --,:!-   .,            !-.            .-      :        *.~                        ~    \r\n"
//				+ "                   ,;$@#             ~             .:      ;        ,;.                       !*    \r\n"
//				+ "                        ;            ;             ,.      :        -~                       -      \r\n"
//				+ "                        .:           .             $       !        $,                   ,=:,:      \r\n"
//				+ "                         ~~          ~,           ,,       :       ,*                ,--!,  ,:      \r\n"
//				+ "                          -:         .~           !        ,,     .;              ~!~,-             \r\n"
//				+ "                           -~         *          --         :~.   $~      ... ~=#~                  \r\n"
//				+ "                            ~:         ;         ;.          .:,~=;:-,,,-~:;:,                      \r\n"
//				+ "                             .:        ,,       .-              :,                                  \r\n"
//				+ "                              .;,      .~      ,*             ,~,                                   \r\n"
//				+ "                                ,!.     ,*     ~             ;-                                     \r\n"
//				+ "                                  -;..    ;. .!           .~;                                       \r\n"
//				+ "                                    ~-:~  ,-.~        .::-:.                                        \r\n"
//				+ "                                        -*#$*;:~~:!$#*,                    ");

	}
	
}
