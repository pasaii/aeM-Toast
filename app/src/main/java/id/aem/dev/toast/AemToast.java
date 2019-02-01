package id.aem.dev.toast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class AemToast extends Toast {
    public static final int BASIC = 0;
    public static final int INFO = 1;
    public static final int SUCCESS = 2;
    public static final int WARNING = 3;
    public static final int ERROR = 4;

    public AemToast(Context context) {
        super(context);
    }

    public static android.widget.Toast makeText(Context context, CharSequence text, int type, int duration) {
        View toastLayout = LayoutInflater.from(context).inflate(R.layout.toast_layout, null, false);

        ImageView toastType = toastLayout.findViewById(R.id.imgVType);

        LinearLayout layoutMessage = toastLayout.findViewById(R.id.llMessage);

        if (type == BASIC) {
            layoutMessage.setBackgroundResource(R.drawable.basic_background);
            toastType.setVisibility(View.GONE);
        } else if (type == INFO) {
            layoutMessage.setBackgroundResource(R.drawable.info_background);
            toastType.setImageResource(R.drawable.ic_info);
        } else if (type == SUCCESS) {
            layoutMessage.setBackgroundResource(R.drawable.success_background);
            toastType.setImageResource(R.drawable.ic_success);
        } else if (type == WARNING) {
            layoutMessage.setBackgroundResource(R.drawable.warning_background);
            toastType.setImageResource(R.drawable.ic_warning);
        } else if (type == ERROR) {
            layoutMessage.setBackgroundResource(R.drawable.error_background);
            toastType.setImageResource(R.drawable.ic_error);
        }

        TextView toastMessage = toastLayout.findViewById(R.id.txtVMessage);
        toastMessage.setText(text);

        ImageView toastIcon = toastLayout.findViewById(R.id.imgVToast);
        toastIcon.setImageDrawable(context.getApplicationInfo().loadIcon(context.getPackageManager()));

        android.widget.Toast toast = new android.widget.Toast(context);
        toast.setView(toastLayout);
        toast.setDuration(duration);
        return toast;
    }

    public static android.widget.Toast makeText(Context context, CharSequence text, int type, int duration, int customIcon) {
        View toastLayout = LayoutInflater.from(context).inflate(R.layout.toast_layout, null, false);

        ImageView toastType = toastLayout.findViewById(R.id.imgVType);

        LinearLayout layoutMessage = toastLayout.findViewById(R.id.llMessage);

        if (type == BASIC) {
            layoutMessage.setBackgroundResource(R.drawable.basic_background);
            toastType.setVisibility(View.GONE);
        } else if (type == INFO) {
            layoutMessage.setBackgroundResource(R.drawable.info_background);
            toastType.setImageResource(R.drawable.ic_info);
        } else if (type == SUCCESS) {
            layoutMessage.setBackgroundResource(R.drawable.success_background);
            toastType.setImageResource(R.drawable.ic_success);
        } else if (type == WARNING) {
            layoutMessage.setBackgroundResource(R.drawable.warning_background);
            toastType.setImageResource(R.drawable.ic_warning);
        } else if (type == ERROR) {
            layoutMessage.setBackgroundResource(R.drawable.error_background);
            toastType.setImageResource(R.drawable.ic_error);
        }

        TextView toastMessage = toastLayout.findViewById(R.id.txtVMessage);
        toastMessage.setText(text);

        ImageView toastIcon = toastLayout.findViewById(R.id.imgVToast);
        toastIcon.setImageResource(customIcon);

        android.widget.Toast toast = new android.widget.Toast(context);
        toast.setView(toastLayout);
        toast.setDuration(duration);
        return toast;
    }
}
