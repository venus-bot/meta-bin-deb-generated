PACKAGES = "${PN} libxau-dev libxau6"
PROVIDES = "libxau-dev libxau6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libx/libxau/libxau-dev_1.0.8-1+b2_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/libx/libxau/libxau6_1.0.8-1+b2_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libxau-dev = "libxau-dev_1.0.8-1+b2_armhf.deb"
SRC_URI[deb0.sha256sum] = "0a7803f2807e3912b6cb0641fc77ca142af9721724a4e971bf6c08d3020369ad"
SRC_URI[deb0.md5sum] = "615aaed397be295a67366c2e728cd51f"
DEBFILENAME_libxau6 = "libxau6_1.0.8-1+b2_armhf.deb"
SRC_URI[deb1.sha256sum] = "1d1c083edfc29fa3a0c7539565357fcf2f90488dee919444a155afee59ca85eb"
SRC_URI[deb1.md5sum] = "1e63124a75be3eef227de04776cf7e34"

RDEPENDS_${PN}-dev = "libxau6 (= 1:1.0.8-1+b2) x11proto-core-dev"
RDEPENDS_${PN}6 = "libc6 (>= 2.4)"
DEPENDS = "libc6 x11proto-core-dev"


inherit deb_group

FILES_${PN}-dev = " \
    ./usr/include/X11/Xauth.h \
    ./usr/lib/arm-linux-gnueabihf/libXau.a \
    ./usr/lib/arm-linux-gnueabihf/libXau.so \
    ./usr/lib/arm-linux-gnueabihf/pkgconfig/xau.pc \
    ./usr/share/doc/libxau-dev/changelog.Debian.armhf.gz \
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
    ./usr/share/doc/libxau6/changelog.Debian.armhf.gz \
    ./usr/share/doc/libxau6/changelog.Debian.gz \
    ./usr/share/doc/libxau6/changelog.gz \
    ./usr/share/doc/libxau6/copyright\
"
