PACKAGES = "${PN} libreadline6 readline-common"
PROVIDES = "libreadline6 readline-common"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/r/readline6/libreadline6_6.3-8+b3_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/r/readline6/readline-common_6.3-8_all.deb;unpack=0;name=deb1\
"
DEBFILENAME_libreadline6 = "libreadline6_6.3-8+b3_armhf.deb"
SRC_URI[deb0.sha256sum] = "c62ee18648398b658c4374b818add3d487fbdc42cac61c0458f1f3022c37a1fe"
SRC_URI[deb0.md5sum] = "252d049d6969995b3ab903f48667e1c2"
DEBFILENAME_readline-common = "readline-common_6.3-8_all.deb"
SRC_URI[deb1.sha256sum] = "8b91bce988c38798e565820919a600f1a58ca483d8406860cc37e847a55a6bfd"
SRC_URI[deb1.md5sum] = "d072984a0bf5e597ca57bc8f07ef1849"

RDEPENDS_lib${PN} = "libc6 (>= 2.15) libtinfo5 readline-common"
RDEPENDS_readline-common = "dpkg (>= 1.15.4)"
DEPENDS = "dpkg libc6 libtinfo5"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libreadline6 = " \
    ./lib/arm-linux-gnueabihf/libhistory.so.6 \
    ./lib/arm-linux-gnueabihf/libhistory.so.6.3 \
    ./lib/arm-linux-gnueabihf/libreadline.so.6 \
    ./lib/arm-linux-gnueabihf/libreadline.so.6.3 \
    ./usr/share/doc/libreadline6/README.Debian \
    ./usr/share/doc/libreadline6/USAGE \
    ./usr/share/doc/libreadline6/changelog.Debian.armhf.gz \
    ./usr/share/doc/libreadline6/changelog.Debian.gz \
    ./usr/share/doc/libreadline6/changelog.gz \
    ./usr/share/doc/libreadline6/copyright \
    ./usr/share/doc/libreadline6/examples/Inputrc \
    ./usr/share/doc/libreadline6/inputrc.arrows\
"
FILES_readline-common = " \
    ./usr/share/doc/readline-common/changelog.Debian.gz \
    ./usr/share/doc/readline-common/copyright \
    ./usr/share/doc/readline-common/inputrc.arrows \
    ./usr/share/info/rluserman.info.gz \
    ./usr/share/lintian/overrides/readline-common \
    ./usr/share/man/man3/history.3readline.gz \
    ./usr/share/man/man3/readline.3readline.gz \
    ./usr/share/readline/inputrc\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
