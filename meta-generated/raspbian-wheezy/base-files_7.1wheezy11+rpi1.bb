PACKAGES = "base-files"
PROVIDES = "base-files"
SRC_URI = " \
	http://archive.raspbian.org/raspbian/pool/main/b/base-files/base-files_7.1wheezy11+rpi1_armhf.deb;unpack=0;name=deb0\
"
DEBFILENAME_base-files = "base-files_7.1wheezy11+rpi1_armhf.deb"
SRC_URI[deb0.sha256sum] = "4ba6f0d196c9757d4417b0012e494f0aa6056925b64df4f20a1319cad7c8047f"
SRC_URI[deb0.md5sum] = "f7528f0b04ec19dda0f769d7448931cf"


inherit deb_group

# Prebuilt binaries, no need for any default dependencies
INHIBIT_DEFAULT_DEPS = "1"
INHIBIT_PACKAGE_STRIP = "1"
INSANE_SKIP_${PN} += "already-stripped"

FILES_${PN} = " \
	./usr/share/common-licenses/GFDL \
	./usr/share/base-files/staff-group-for-usr-local \
	./usr/share/common-licenses/Artistic \
	./usr/share/doc/base-files/FAQ \
	./usr/share/common-licenses/GFDL-1.2 \
	./usr/share/common-licenses/GFDL-1.3 \
	./usr/share/base-files/motd \
	./usr/share/doc/base-files/changelog.gz \
	./usr/share/base-files/dot.profile \
	./etc/issue.net.orig \
	./usr/share/base-files/profile \
	./etc/debian_version \
	./etc/issue.net \
	./usr/share/doc/base-files/README.FHS \
	./usr/share/doc/base-files/README \
	./etc/dpkg/origins/debian \
	./usr/share/common-licenses/GPL \
	./usr/share/base-files/nsswitch.conf \
	./usr/share/common-licenses/LGPL-3 \
	./usr/share/common-licenses/LGPL-2 \
	./usr/share/doc/base-files/copyright \
	./usr/share/common-licenses/GPL-1 \
	./usr/share/common-licenses/GPL-2 \
	./usr/share/common-licenses/GPL-3 \
	./etc/os-release \
	./usr/share/base-files/dot.bashrc \
	./usr/share/base-files/info.dir \
	./etc/os-release.orig \
	./usr/share/common-licenses/BSD \
	./etc/issue.orig \
	./etc/dpkg/origins/raspbian \
	./usr/share/lintian/overrides/base-files \
	./etc/host.conf \
	./usr/share/base-files/profile.md5sums \
	./usr/share/common-licenses/LGPL \
	./etc/issue \
	./usr/share/common-licenses/Apache-2.0 \
	./usr/share/common-licenses/LGPL-2.1\
"
#FAKE LICENSE FOR TESTING!!!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
