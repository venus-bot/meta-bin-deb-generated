PACKAGES = "libxau-dev libxau6"
PROVIDES = "libxau-dev libxau6"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libx/libxau/libxau-dev_1.0.8-1_armhf.deb;unpack=0;name=deb0\
	http://archive.raspbian.org/raspbian/pool/main/libx/libxau/libxau6_1.0.8-1_armhf.deb;unpack=0;name=deb1\
"
DEBFILENAME_libxau-dev = "libxau-dev_1.0.8-1_armhf.deb"
SRC_URI[deb0.sha256sum] = "0d2ece1a2a4888549869384dd58342b59b9017f0ca3d7170435ad40728b5d687"
SRC_URI[deb0.md5sum] = "226dbcb6ab75fde137018e140d662e03"
DEBFILENAME_libxau6 = "libxau6_1.0.8-1_armhf.deb"
SRC_URI[deb1.sha256sum] = "69b7acf346ba3f997eb2b4e68924c4f1023d4a05f4950a73a10f88b776e24388"
SRC_URI[deb1.md5sum] = "88df5d710117b5a5790b867ce5ca6c86"

RDEPENDS_${PN}-dev = "libxau6 (= 1:1.0.8-1) x11proto-core-dev"
RDEPENDS_${PN}6 = "libc6 (>= 2.4)"
DEPENDS = "x11proto-core-dev libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN}-dev = " \
	./usr/share/man/man3/XauDisposeAuth.3.gz \
	./usr/share/man/man3/XauUnlockAuth.3.gz \
	./usr/share/man/man3/XauReadAuth.3.gz \
	./usr/share/doc/libxau-dev/changelog.gz \
	./usr/share/doc/libxau-dev/copyright \
	./usr/lib/arm-linux-gnueabihf/libXau.so \
	./usr/share/man/man3/XauFileName.3.gz \
	./usr/share/man/man3/XauGetBestAuthByAddr.3.gz \
	./usr/share/man/man3/XauWriteAuth.3.gz \
	./usr/include/X11/Xauth.h \
	./usr/share/man/man3/Xau.3.gz \
	./usr/share/man/man3/XauGetAuthByAddr.3.gz \
	./usr/lib/arm-linux-gnueabihf/libXau.a \
	./usr/share/man/man3/XauLockAuth.3.gz \
	./usr/lib/arm-linux-gnueabihf/pkgconfig/xau.pc \
	./usr/share/doc/libxau-dev/changelog.Debian.gz\
"
FILES_libxau6 = " \
	./usr/lib/arm-linux-gnueabihf/libXau.so.6.0.0 \
	./usr/share/doc/libxau6/copyright \
	./usr/share/doc/libxau6/changelog.gz \
	./usr/lib/arm-linux-gnueabihf/libXau.so.6 \
	./usr/share/doc/libxau6/changelog.Debian.gz\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
