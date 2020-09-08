PACKAGES = "${PN} libreadline7 readline-common"
PROVIDES = "libreadline7 readline-common"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/r/readline/libreadline7_7.0-5_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/r/readline/readline-common_7.0-5_all.deb;unpack=0;name=deb1\
"
DEBFILENAME_libreadline7 = "libreadline7_7.0-5_armhf.deb"
SRC_URI[deb0.sha256sum] = "f655bfd17328343631ea6dd3fc7d885184a518fa397881f4d32f2a30b1e8fcb5"
SRC_URI[deb0.md5sum] = "d9eedc9b03489fae4e5f7cda00fccf29"
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
