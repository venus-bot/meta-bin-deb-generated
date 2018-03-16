PACKAGES = "${PN} libxau-dev libxau6"
PROVIDES = "libxau-dev libxau6"
SRC_URI = " \
	http://ftp.de.debian.org/debian/pool/main/libx/libxau/libxau-dev_1.0.8-1_armhf.deb;unpack=0;name=deb0\
	http://ftp.de.debian.org/debian/pool/main/libx/libxau/libxau6_1.0.8-1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libxau-dev = "libxau-dev_1.0.8-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "9369d7f69b7b026ba3de65d3ff3ded4821dbb9df4790921f3f44147efd798627"
SRC_URI[deb0.md5sum] = "03f100f322ca548c43510c7bef1ccd5a"
DEBFILENAME_libxau6 = "libxau6_1.0.8-1_armhf.deb"
SRC_URI[deb1.sha256sum] = "5c0395d79cf16acb86708ed37fa5bf31734cde01771a5d226c7a89f611108bf7"
SRC_URI[deb1.md5sum] = "d3ae7c68e51a44e6e07b0afad56d559f"

RDEPENDS_${PN}-dev = "libxau6 (= 1:1.0.8-1) x11proto-core-dev"
RDEPENDS_${PN}6 = "libc6 (>= 2.4)"
DEPENDS = "libc6 x11proto-core-dev"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN}-dev = " \
    ./usr/include/X11/Xauth.h \
    ./usr/lib/arm-linux-gnueabihf/libXau.a \
    ./usr/lib/arm-linux-gnueabihf/libXau.so \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/xau.pc \
    ./usr/share/doc/libxau-dev/changelog.Debian.gz \
    ./usr/share/doc/libxau-dev/changelog.gz \
    ./usr/share/doc/libxau-dev/copyright \
    ./usr/share/man/man3/Xau.3.gz \
    ./usr/share/man/man3/XauDisposeAuth.3.gz \
    ./usr/share/man/man3/XauFileName.3.gz \
    ./usr/share/man/man3/XauGetAuthByAddr.3.gz \
    ./usr/share/man/man3/XauGetBestAuthByAddr.3.gz \
    ./usr/share/man/man3/XauLockAuth.3.gz \
    ./usr/share/man/man3/XauReadAuth.3.gz \
    ./usr/share/man/man3/XauUnlockAuth.3.gz \
    ./usr/share/man/man3/XauWriteAuth.3.gz\
"
FILES_libxau6 = " \
    ./usr/lib/arm-linux-gnueabihf/libXau.so.6 \
    ./usr/lib/arm-linux-gnueabihf/libXau.so.6.0.0 \
    ./usr/share/doc/libxau6/changelog.Debian.gz \
    ./usr/share/doc/libxau6/changelog.gz \
    ./usr/share/doc/libxau6/copyright\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
