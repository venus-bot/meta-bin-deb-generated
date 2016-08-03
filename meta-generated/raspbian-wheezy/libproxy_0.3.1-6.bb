PACKAGES = "libproxy0"
PROVIDES = "libproxy0"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/libp/libproxy/libproxy0_0.3.1-6_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_libproxy0 = "libproxy0_0.3.1-6_armhf.deb"
SRC_URI[deb0.sha256sum] = "cd8c79b9823d8a1ad97ac13094441ad6d813dff9fe401a36cfc3227654cd5aea"
SRC_URI[deb0.md5sum] = "05cfe05d2184633865890bb4de4ede3f"

RDEPENDS_${PN}0 = "libc6 (>= 2.13-28)"
DEPENDS = "libc6"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_libproxy0 = " \
	./usr/share/doc/libproxy0/copyright \
	./usr/lib/arm-linux-gnueabihf/libproxy/0.3.1/modules/config_file.so \
	./usr/lib/arm-linux-gnueabihf/libproxy.so.0.0.0 \
	./usr/lib/arm-linux-gnueabihf/libproxy/0.3.1/modules/wpad_dns.so \
	./usr/lib/arm-linux-gnueabihf/libproxy/0.3.1/modules/config_gnome.so \
	./usr/lib/arm-linux-gnueabihf/libproxy/0.3.1/modules/config_wpad.so \
	./usr/lib/arm-linux-gnueabihf/libproxy/0.3.1/modules/pacrunner_webkit.so \
	./usr/lib/arm-linux-gnueabihf/libproxy/0.3.1/modules/config_direct.so \
	./usr/share/doc/libproxy0/AUTHORS \
	./usr/lib/arm-linux-gnueabihf/libproxy/0.3.1/modules/network_networkmanager.so \
	./usr/share/doc/libproxy0/changelog.gz \
	./usr/lib/arm-linux-gnueabihf/libproxy/0.3.1/modules/ignore_domain.so \
	./usr/lib/arm-linux-gnueabihf/libproxy.so.0 \
	./usr/lib/arm-linux-gnueabihf/libproxy/0.3.1/modules/pacrunner_mozjs.so \
	./usr/lib/arm-linux-gnueabihf/libproxy/0.3.1/modules/config_envvar.so \
	./usr/lib/arm-linux-gnueabihf/libproxy/0.3.1/modules/ignore_ip.so \
	./usr/share/doc/libproxy0/changelog.Debian.gz \
	./usr/share/doc/libproxy0/README \
	./usr/share/doc/libproxy0/NEWS.gz \
	./usr/lib/arm-linux-gnueabihf/libproxy/0.3.1/modules/config_kde4.so\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
