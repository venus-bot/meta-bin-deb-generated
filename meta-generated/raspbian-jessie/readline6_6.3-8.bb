PACKAGES = "${PN} libreadline6 readline-common"
PROVIDES = "libreadline6 readline-common"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/r/readline6/libreadline6_6.3-8_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/r/readline6/readline-common_6.3-8_all.deb;unpack=0;name=deb1\
"
DEBFILENAME_libreadline6 = "libreadline6_6.3-8_armhf.deb"
SRC_URI[deb0.sha256sum] = "4319325066a3a10abb745262752bf1b877ab36f21cbbb0e1aa6c7aedd79b093f"
SRC_URI[deb0.md5sum] = "e623df72fce51005f5fa366ced8601bb"
DEBFILENAME_readline-common = "readline-common_6.3-8_all.deb"
SRC_URI[deb1.sha256sum] = "8b91bce988c38798e565820919a600f1a58ca483d8406860cc37e847a55a6bfd"
SRC_URI[deb1.md5sum] = "d072984a0bf5e597ca57bc8f07ef1849"

RDEPENDS_lib${PN} = "readline-common libc6 (>= 2.15) libtinfo5"
RDEPENDS_readline-common = "dpkg (>= 1.15.4)"
DEPENDS = "libc6 dpkg libtinfo5"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libreadline6 = " \
    ./usr/share/doc/libreadline6/copyright \
    ./usr/share/doc/libreadline6/examples/Inputrc \
    ./usr/share/doc/libreadline6/README.Debian \
    ./usr/share/doc/libreadline6/inputrc.arrows \
    ./usr/share/doc/libreadline6/USAGE \
    ./lib/arm-linux-gnueabihf/libhistory.so.6.3 \
    ./lib/arm-linux-gnueabihf/libhistory.so.6 \
    ./usr/share/doc/libreadline6/changelog.Debian.gz \
    ./lib/arm-linux-gnueabihf/libreadline.so.6 \
    ./lib/arm-linux-gnueabihf/libreadline.so.6.3 \
    ./usr/share/doc/libreadline6/changelog.gz\
"
FILES_readline-common = " \
    ./usr/share/doc/readline-common/copyright \
    ./usr/share/doc/readline-common/inputrc.arrows \
    ./usr/share/readline/inputrc \
    ./usr/share/man/man3/readline.3readline.gz \
    ./usr/share/man/man3/history.3readline.gz \
    ./usr/share/doc/readline-common/changelog.Debian.gz \
    ./usr/share/lintian/overrides/readline-common \
    ./usr/share/info/rluserman.info.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
