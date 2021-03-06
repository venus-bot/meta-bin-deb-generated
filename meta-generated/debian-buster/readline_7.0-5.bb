PACKAGES = "${PN} libreadline7 readline-common"
PROVIDES = "libreadline7 readline-common"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/r/readline/libreadline7_7.0-5_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/r/readline/readline-common_7.0-5_all.deb;unpack=0;name=deb1\
"
DEBFILENAME_libreadline7 = "libreadline7_7.0-5_armhf.deb"
SRC_URI[deb0.sha256sum] = "de3aa01b6ecfa5b57e5011e400abddf9174056588c21b42189b497e65a67d983"
SRC_URI[deb0.md5sum] = "d9ae4ff31300d606b45dcf717080724f"
DEBFILENAME_readline-common = "readline-common_7.0-5_all.deb"
SRC_URI[deb1.sha256sum] = "153d8a5ddb04044d10f877a8955d944612ec9035f4c73eec99d85a92c3816712"
SRC_URI[deb1.md5sum] = "9029400671685a94dee31d91c1c080b9"

RDEPENDS_lib${PN}7 = "libc6 (>= 2.15) libtinfo6 (>= 6) readline-common"
RDEPENDS_${PN}-common = "dpkg (>= 1.15.4)"
DEPENDS = "dpkg libc6 libtinfo6"


inherit deb_group

FILES_libreadline7 = " \
    ./lib/arm-linux-gnueabihf/libhistory.so.7 \
    ./lib/arm-linux-gnueabihf/libhistory.so.7.0 \
    ./lib/arm-linux-gnueabihf/libreadline.so.7 \
    ./lib/arm-linux-gnueabihf/libreadline.so.7.0 \
    ./usr/share/doc/libreadline7/README.Debian \
    ./usr/share/doc/libreadline7/USAGE \
    ./usr/share/doc/libreadline7/changelog.Debian.gz \
    ./usr/share/doc/libreadline7/changelog.gz \
    ./usr/share/doc/libreadline7/copyright \
    ./usr/share/doc/libreadline7/examples/Inputrc \
    ./usr/share/doc/libreadline7/inputrc.arrows\
"
FILES_readline-common = " \
    ./usr/share/doc/readline-common/changelog.Debian.gz \
    ./usr/share/doc/readline-common/changelog.gz \
    ./usr/share/doc/readline-common/copyright \
    ./usr/share/doc/readline-common/inputrc.arrows \
    ./usr/share/info/rluserman.info.gz \
    ./usr/share/lintian/overrides/readline-common \
    ./usr/share/man/man3/history.3readline.gz \
    ./usr/share/man/man3/readline.3readline.gz \
    ./usr/share/readline/inputrc\
"
